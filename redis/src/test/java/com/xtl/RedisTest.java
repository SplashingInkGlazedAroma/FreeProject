package com.xtl;

import com.xtl.utils.RedisUtil;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import redis.clients.jedis.Jedis;

import java.util.List;

/**
 * @author 31925
 * @ClassName RedisTest
 * @Description redis测试
 * @date 2022/5/7 11:27
 */
public class RedisTest {

    private Jedis jedis=null;

    @Before
    public void before(){
        jedis= RedisUtil.getJedis();
    }

    @Test
    public void testString(){
        String set = jedis.set("name", "唐三");
        System.out.println(set);
        String name = jedis.get("name");
        System.out.println(name);
    }

    @Test
    public void testHash() {
        jedis.hset("user","name","萧炎");
        jedis.hset("user","age","18");
        System.out.println(jedis.hget("user", "age"));
    }

    @Test
    public void testList() {
        jedis.lpush("students","唐三","萧炎","林动","李星云");
        System.out.println(jedis.rpop("students"));
    }

    @Test
    public void testZSet() {
        jedis.zadd("results",100,"朴乾");
        jedis.zadd("results",99,"陈哲");
        List<String> result = jedis.zrange("result", 0, 2);
        result.forEach(System.out::println);
    }

    @Test
    public void testSet() {
        jedis.sadd("mySet", "进击的巨人");
        jedis.sadd("mySet", "秦时明月");
        jedis.sadd("mySet", "不良人");
        jedis.sadd("mySet", "灵笼");
        long count = jedis.scard("mySet");
        System.out.println(count);
    }

    @After
    public void close(){
        jedis.close();
    }
}
