package com.joaoh.site.priscila.domain.dto;

import java.io.Serializable;
import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EventoDTO implements Serializable {
    private String descricao;
    private String nome;
    private LocalDate data;

    public EventoDTO() {}

    public EventoDTO(String descricao, String nome, LocalDate data) {
        this.descricao = descricao;
        this.nome = nome;
        this.data = data;
    }

}
