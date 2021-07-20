package com.joaoh.site.priscila.domain;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

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

    @Column(nullable = false)
    private String nome;
    
    @Column(nullable = false)
    private LocalDate data;
    
    @Column(nullable = false)
    private String descricao;

    private String fotoCapa;

    public Evento() {}


    public Evento(Integer id, String nome, LocalDate data, String descricao, String fotoCapa) {
        this.nome = nome;
        this.id = id;
        this.data = data;
        this.descricao = descricao;
        this.fotoCapa = fotoCapa; 
    }

}
