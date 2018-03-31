package com.richard.appmc.dto;

import com.richard.appmc.domain.Cidade;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@Data
public class CidadeDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;
    private String nome;

    public CidadeDTO(Cidade obj) {
        id = obj.getId();
        nome = obj.getNome();
    }
}
