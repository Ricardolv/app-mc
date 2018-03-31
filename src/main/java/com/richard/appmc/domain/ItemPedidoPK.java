package com.richard.appmc.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@EqualsAndHashCode(of = { "pedido", "produto" })
@Data
@Embeddable
public class ItemPedidoPK implements Serializable {
    private static final long serialVersionUID = 1L;


    @ManyToOne
    @JoinColumn(name = "pedido_id")
    private Pedido pedido;

    @ManyToOne
    @JoinColumn(name = "produto_id")
    private Produto produto;
}
