package br.paulotrc.svcvendavalidador.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Cliente(UUID id, String nome, Long celular, Integer ddd_celular, String cpf_cnpj) {
    @Override
    @JsonProperty("id")
    public UUID id() {
        return id;
    }

    @Override
    @JsonProperty("nome")
    public String nome() {
        return nome;
    }

    @Override
    @JsonProperty("celular")
    public Long celular() {
        return celular;
    }

    @Override
    @JsonProperty("ddd_celular")
    public Integer ddd_celular() {
        return ddd_celular;
    }

    @Override
    @JsonProperty("cpf_cnpj")
    public String cpf_cnpj() {
        return cpf_cnpj;
    }
}
