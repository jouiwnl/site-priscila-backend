package com.joaoh.site.priscila;

import java.time.LocalDate;
import java.util.Arrays;

import com.joaoh.site.priscila.domain.Aluno;
import com.joaoh.site.priscila.domain.Evento;
import com.joaoh.site.priscila.domain.Turma;
import com.joaoh.site.priscila.repositories.AlunoRepository;
import com.joaoh.site.priscila.repositories.EventoRepository;
import com.joaoh.site.priscila.repositories.TurmaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PriscilaApplication implements CommandLineRunner {

	@Autowired
	private AlunoRepository alunoRepository;

	@Autowired
	private EventoRepository eventoRepository;

	@Autowired
	private TurmaRepository turmaRepository;

	public static void main(String[] args) {
		SpringApplication.run(PriscilaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Turma t1 = new Turma(null, "ADULTO");
		Turma t2 = new Turma(null, "JOVEM");
		Turma t3 = new Turma(null, "INFANTIL");

		turmaRepository.saveAll(Arrays.asList(t1, t2, t3));

		Aluno a1 = new Aluno(null, "Laura Valiente", "123456789111", LocalDate.parse("2002-10-25"), t1);
		alunoRepository.save(a1);
		t1.getAlunos().add(a1);

		Evento e1 = new Evento(null, "Noite Teatral", LocalDate.parse("2021-11-19"), "Apresentações dos alunos referentes aos projetos feitos no ano");
		eventoRepository.save(e1);
	}

}
