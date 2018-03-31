package com.richard.appmc.dto;

import com.richard.appmc.domain.Produto;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@Data
public class ProdutoDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;
    private String nome;
    private Double preco;

    public ProdutoDTO(Produto obj) {
        id = obj.getId();
        nome = obj.getNome();
        preco = obj.getPreco();
    }
}
