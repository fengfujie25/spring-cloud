package com.mm.redisstudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import redis.clients.jedis.Jedis;

@SpringBootApplication
public class RedisStudyApplication {

    private static String HOST = "127.0.0.1";

    private static int PROT = 6379;

    private static String INSTANCEID = "crs-nbckznb8";

    private static String PASS_WORD = "fengfujie123.";

    public static void main(String[] args) {
        SpringApplication.run(RedisStudyApplication.class, args);

        Jedis jedis = new Jedis(HOST, PROT);

//        jedis.auth(INSTANCEID + ":" + PASS_WORD);

        jedis.set("redis_test", "test");

        String value = jedis.get("redis_test");

        System.out.println(value);

        jedis.quit();
        jedis.close();

    }

}
