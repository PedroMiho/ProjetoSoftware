package com.premium.outlet.dto;

import com.premium.outlet.enums.Tamanho;

//Construtor
//Getter
//Setter
public record DadosCadastroRoupa(
        String tipo,
        String marca,
        Tamanho tamanho,
        int quantidade,
        double valor
) {
}
