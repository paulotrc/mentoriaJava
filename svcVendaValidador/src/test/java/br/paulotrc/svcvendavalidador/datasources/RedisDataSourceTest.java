package br.paulotrc.svcvendavalidador.datasources;


import br.paulotrc.svcvendavalidador.configuracoes.RedisPoolComponent;
import br.paulotrc.svcvendavalidador.entities.RequestVenda;
import br.paulotrc.svcvendavalidador.util.DataMock;
import br.paulotrc.svcvendavalidador.util.JsonUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

public class RedisDataSourceTest {

    @InjectMocks
    RedisDataSource redisDataSource;
    @Mock
    RedisPoolComponent redisPoolComponent;

    @BeforeEach
    void setup(){
        redisDataSource = new RedisDataSource(new RedisPoolComponent());
    }

    @Test
    @DisplayName("Deve incluir um request com sucesso")
    void deveIncluirComSucessoUmRequest() throws Exception {
        RequestVenda requestVenda = DataMock.getRequestVenda();
        redisDataSource.incluiRequest(requestVenda);
        Assertions.assertEquals(true, true);
    }

    @Test
    @DisplayName("Deve efetuar uma consulta com sucesso de um request")
    void deveConsultarComSucessoUmIdDeRequest() throws Exception {
        RequestVenda requestVenda = DataMock.getRequestVenda();
        boolean retorno = redisDataSource.consultaRequest(requestVenda);
        Assertions.assertEquals(true, retorno);
    }

    @Test
    @DisplayName("Deve efetuar uma consulta com sucesso de um request e printar seu conteúdo")
    void deveConsultarComSucessoUmIdDeRequestEPrintarSeuConteudo() throws Exception {
        RequestVenda requestVenda = DataMock.getRequestVenda();
        String retorno = redisDataSource.consultaDadosRequest(requestVenda);
        JsonUtil jsonUtil = new JsonUtil<RequestVenda>();
        RequestVenda retornoConvertido = (RequestVenda) jsonUtil.jsonStringToClass(retorno, RequestVenda.class);
        Assertions.assertEquals(retornoConvertido, requestVenda);
    }
}
