package com.joaoh.site.priscila.domain.dto;

import java.io.Serializable;

import com.joaoh.site.priscila.domain.enums.TipoTurma;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AlunoDTO implements Serializable {

    private String nome;
    private TipoTurma turma;

    public AlunoDTO () {}


    public AlunoDTO(String nome, TipoTurma turma) {
        this.nome = nome;
        this.turma = turma;
    }
    
}
