package br.paulotrc.svcvendavalidador.datasources;

import br.paulotrc.svcvendavalidador.configuracoes.RedisPoolComponent;
import br.paulotrc.svcvendavalidador.entities.RequestVenda;
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
}
