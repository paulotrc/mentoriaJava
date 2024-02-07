package br.paulotrc.svcvendavalidador.util;

import br.paulotrc.svcvendavalidador.entities.Cliente;
import br.paulotrc.svcvendavalidador.entities.RequestVenda;

import java.math.BigDecimal;
import java.util.UUID;

public class DataMock {

    public static RequestVenda getRequestVenda(){
        return new RequestVenda(UUID.fromString("431b88dd-492b-43a2-af1e-8984d7ff6592"), 10, "Celular", new BigDecimal(5000.00), getCliente());
    }

    public static Cliente getCliente(){
        return new Cliente(UUID.fromString("2c0b97a9-5065-4917-ab53-db62baf6a2df"), "Sebastião Vilarino Souza", 998875241L, 15,"47551966048");
    }
}
