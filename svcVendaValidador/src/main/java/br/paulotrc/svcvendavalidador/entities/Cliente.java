package br.paulotrc.svcvendavalidador.entities;

import java.util.UUID;

public record Cliente(UUID id, String nome, Long celular, Integer ddd_celular, String cpf_cnpj) {
    @Override
    public UUID id() {
        return id;
    }

    @Override
    public String nome() {
        return nome;
    }

    @Override
    public Long celular() {
        return celular;
    }

    @Override
    public Integer ddd_celular() {
        return ddd_celular;
    }

    @Override
    public String cpf_cnpj() {
        return cpf_cnpj;
    }
}
