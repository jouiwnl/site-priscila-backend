package com.joaoh.site.priscila.services;

import java.util.List;
import java.util.Random;

import com.joaoh.site.priscila.domain.Aluno;
import com.joaoh.site.priscila.domain.Turma;
import com.joaoh.site.priscila.domain.dto.AlunoDTO;
import com.joaoh.site.priscila.repositories.AlunoRepository;
import com.joaoh.site.priscila.services.exceptions.ObjectNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository alunoRepository;

    @Autowired
    private TurmaService turmaService;

    public List<Aluno> findAll() {
        return alunoRepository.findAll();
    }

    public Aluno findById(Integer alunoId) {
        return alunoRepository.findById(alunoId)
                .orElseThrow(() -> new ObjectNotFoundException("Cidade id " + alunoId + " não encontrado"));
    }

    public Aluno insert(Aluno aluno) {

        Random random = new Random();
        int numero = random.nextInt(100);

        aluno.setId(null);
        aluno.setMatricula(numero);

        return alunoRepository.save(aluno);
    }

    public Aluno update (AlunoDTO alunoDto, Integer alunoId) {
        Aluno aluno = this.fromDTO(alunoId, alunoDto);
        return alunoRepository.save(aluno);
    }

    public Aluno fromDTO (Integer alunoId, AlunoDTO objDto) {
        Aluno aluno = this.findById(alunoId);
        Turma turma = turmaService.findById(objDto.getTurmaId());

        aluno.setNome(objDto.getNome());
        aluno.setTurma(turma);

        if (aluno.getMatricula() == null) {
            Random random = new Random();
            int numero = random.nextInt(100);

            aluno.setMatricula(numero);
        } else {
            aluno.setMatricula(aluno.getMatricula());
        }

        return aluno;
    }
    
}
