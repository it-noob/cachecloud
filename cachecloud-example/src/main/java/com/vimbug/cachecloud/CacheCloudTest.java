package com.vimbug.cachecloud;

import com.sohu.tv.builder.ClientBuilder;
import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import redis.clients.jedis.JedisCluster;

public class CacheCloudTest {


    public static void main(String[] args) {
        long appId = 10000;
        /**
         * 使用自定义配置：
         * 1. setTimeout：redis操作的超时设置；
         * 2. setMaxRedirections：节点定位重试的次数；
         */
        GenericObjectPoolConfig poolConfig = new GenericObjectPoolConfig();
        JedisCluster redisCluster = ClientBuilder.redisCluster(appId)
                .setJedisPoolConfig(poolConfig)
                .setConnectionTimeout(1000)
                .setSoTimeout(1000)
                .setMaxRedirections(5)
                .build();
        int index = 0;
        while (true) {
            //1.字符串value
            redisCluster.set("key" + index, "value" + index);
            System.out.println(redisCluster.get("key" + index));
            index++;
        }
    }

}
