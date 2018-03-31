package com.richard.appmc.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.richard.appmc.domain.enums.EstadoPagamento;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import java.util.Date;

@NoArgsConstructor
@Entity
@JsonTypeName("pagamentoComBoleto")
public class PagamentoComBoleto extends Pagamento {
    private static final long serialVersionUID = 1L;

    @Getter @Setter
    @JsonFormat(pattern="dd/MM/yyyy")
    private Date dataVencimento;

    @Getter @Setter
    @JsonFormat(pattern="dd/MM/yyyy")
    private Date dataPagamento;

    public PagamentoComBoleto(Integer id, EstadoPagamento estado, Pedido pedido, Date dataVencimento, Date dataPagamento) {
        super(id, estado, pedido);
        this.dataPagamento = dataPagamento;
        this.dataVencimento = dataVencimento;
    }
}
