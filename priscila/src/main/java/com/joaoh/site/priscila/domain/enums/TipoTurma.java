package com.joaoh.site.priscila.domain.enums;

import lombok.Getter;

@Getter
public enum TipoTurma {
    ADULTO(1, "Turma Adulta"),
    JOVEM(2, "Turma Jovem"),
    INFANTIL(3, "Turma Infantil");

    private Integer cod;
    private String descricao;

    TipoTurma(Integer cod, String descricao) {
        this.cod = cod;
        this.descricao = descricao;
    }

}
