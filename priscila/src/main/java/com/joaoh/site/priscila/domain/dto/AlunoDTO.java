package com.joaoh.site.priscila.domain.dto;

import java.io.Serializable;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AlunoDTO implements Serializable {

    private String nome;
    private Integer turmaId;

    public AlunoDTO () {}


    public AlunoDTO(String nome, Integer turmaId) {
        this.nome = nome;
        this.turmaId = turmaId;
    }
    
}
