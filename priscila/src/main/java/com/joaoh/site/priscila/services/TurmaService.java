package com.joaoh.site.priscila.services;

import com.joaoh.site.priscila.domain.Turma;
import com.joaoh.site.priscila.repositories.TurmaRepository;
import com.joaoh.site.priscila.services.exceptions.ObjectNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TurmaService { 

    @Autowired
    private TurmaRepository turmaRepository;

    public Turma findById(Integer id) {
        return turmaRepository.findById(id)
        .orElseThrow(() -> new ObjectNotFoundException("Cidade id " + id + " não encontrado"));    
    }

}
