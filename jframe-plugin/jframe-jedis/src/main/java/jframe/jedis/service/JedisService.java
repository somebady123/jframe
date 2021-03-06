/**
 * 
 */
package jframe.jedis.service;

import jframe.core.plugin.annotation.Service;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisCluster;

/**
 * @author dzh
 * @date Dec 2, 2014 10:37:37 AM
 * @since 1.0
 */
@Service(clazz = "jframe.jedis.service.JedisServiceImpl", id = "jframe.service.jedis")
public interface JedisService {

    /**
     * 
     * @return jedis.host.default's jedis
     */
    Jedis getJedis();

    Jedis getJedis(String id);

    /**
     * use {@link redis.clients.jedis.Jedis#close()}
     * 
     * @param jedis
     */
    @Deprecated
    void recycleJedis(Jedis jedis);

    /**
     * use {@link redis.clients.jedis.Jedis#close()}
     * 
     * @param jedis
     */
    @Deprecated
    void recycleJedis(String id, Jedis jedis);

    /**
     * unsupported
     * 
     * @param name
     * @return
     */
    JedisCluster getJedisCluster(String name);

    /************************** simple method ***************************/
    String get(String id, String key);

    void setex(String id, String key, String value, Integer expiredSeconds);

    void del(String id, String key);

}
