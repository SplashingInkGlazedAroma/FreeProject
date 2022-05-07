package com.xtl.utils;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * @author 31925
 * @ClassName RedisUtil
 * @Description redis工具类
 * @date 2022/5/7 11:04
 */
public class RedisUtil {
    private static  JedisPool jedisPool;

    static {
        // 配置连接池
        JedisPoolConfig config = new JedisPoolConfig();
        config.setMaxTotal(5);
        config.setMaxIdle(3);
        config.setMinIdle(2);

        // 创建连接池
        jedisPool = new JedisPool(config, "192.168.188.128", 6379);
    }

    /**
     * 获取redis连接
     */
    public static Jedis getJedis() {
        return jedisPool.getResource();
    }
}
