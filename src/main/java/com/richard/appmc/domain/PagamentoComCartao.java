package com.richard.appmc.domain;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.richard.appmc.domain.enums.EstadoPagamento;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

@NoArgsConstructor
@Entity
@JsonTypeName("pagamentoComCartao")
public class PagamentoComCartao extends Pagamento {
    private static final long serialVersionUID = 1L;

    @Getter @Setter
    private Integer numeroDeParcelas;

    public PagamentoComCartao(Integer id, EstadoPagamento estado, Pedido pedido, Integer numeroDeParcelas) {
        super(id, estado, pedido);
        this.numeroDeParcelas = numeroDeParcelas;
    }
}
