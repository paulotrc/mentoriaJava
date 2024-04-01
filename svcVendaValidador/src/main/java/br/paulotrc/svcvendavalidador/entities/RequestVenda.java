package br.paulotrc.svcvendavalidador.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.UUID;
@JsonIgnoreProperties(ignoreUnknown = true)
public record RequestVenda(UUID id, Integer cod_produto, String desc_produto, BigDecimal valor_produto, Cliente cliente) {
    @Override
    @JsonProperty("id")
    public UUID id() {
        return id;
    }

    @Override
    @JsonProperty("cod_produto")
    public Integer cod_produto() {
        return cod_produto;
    }

    @Override
    @JsonProperty("desc_produto")
    public String desc_produto() {
        return desc_produto;
    }

    @Override
    @JsonProperty("valor_produto")
    public BigDecimal valor_produto() {
        return valor_produto;
    }

    @Override
    @JsonProperty("cliente")
    public Cliente cliente() {
        return cliente;
    }
}
