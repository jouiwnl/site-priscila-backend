package com.joaoh.site.priscila.domain;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@EqualsAndHashCode
public class Evento implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private LocalDate data;
    private String descricao;

    public Evento() {}


    public Evento(Integer id, String nome, LocalDate data, String descricao) {
        this.nome = nome;
        this.id = id;
        this.data = data;
        this.descricao = descricao;
    }

}
