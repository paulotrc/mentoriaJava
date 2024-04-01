package br.paulotrc.svcvendavalidador.datasources;

import br.paulotrc.svcvendavalidador.configuracoes.RedisPoolComponent;
import br.paulotrc.svcvendavalidador.entities.RequestVenda;
import br.paulotrc.svcvendavalidador.util.JsonUtil;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;

@Service
public class RedisDataSource {

    private RedisPoolComponent redisPoolComponent;

    public RedisDataSource(RedisPoolComponent redisPoolComponent) {
        this.redisPoolComponent = redisPoolComponent;
    }

    public boolean consultaRequest(RequestVenda requestVenda) {
        Jedis jedis = redisPoolComponent.getRedis();
        return !jedis.get(requestVenda.id().toString()).isEmpty();
    }

    public void incluiRequest(RequestVenda requestVenda) throws JsonProcessingException {
        redisPoolComponent.getRedis().set(requestVenda.id().toString(), JsonUtil.classToJsonString(requestVenda));
    }
}
