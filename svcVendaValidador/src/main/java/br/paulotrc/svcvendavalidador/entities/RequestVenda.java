package br.paulotrc.svcvendavalidador.entities;

import java.math.BigDecimal;
import java.util.UUID;

public record RequestVenda(UUID id, Integer cod_produto, String desc_produto, BigDecimal valor_produto, Cliente cliente) {
    @Override
    public UUID id() {
        return id;
    }

    @Override
    public Integer cod_produto() {
        return cod_produto;
    }

    @Override
    public String desc_produto() {
        return desc_produto;
    }

    @Override
    public BigDecimal valor_produto() {
        return valor_produto;
    }

    @Override
    public Cliente cliente() {
        return cliente;
    }
}
