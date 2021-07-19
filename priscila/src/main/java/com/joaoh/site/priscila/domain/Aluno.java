package com.joaoh.site.priscila.domain;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.joaoh.site.priscila.domain.enums.TipoTurma;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@EqualsAndHashCode
public class Aluno implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer matricula;

    private String nome;
    private String cpf;
    private LocalDate dataNascimento;

    @Enumerated(EnumType.STRING)
    private TipoTurma turma;

    public Aluno () {}


    public Aluno(Integer id, String nome, String cpf, LocalDate dataNascimento, TipoTurma turma) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.turma = turma;
    }

    
}
