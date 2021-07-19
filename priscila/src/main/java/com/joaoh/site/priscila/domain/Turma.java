package com.joaoh.site.priscila.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Turma implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nome;

    @JsonIgnore
    @OneToMany(mappedBy = "turma")
    private List<Aluno> alunos = new ArrayList<>();
    
    public Turma() {}

    public Turma(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }
}
