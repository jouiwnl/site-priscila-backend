package com.joaoh.site.priscila.repositories;

import com.joaoh.site.priscila.domain.Aluno;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Integer> {
    
}
