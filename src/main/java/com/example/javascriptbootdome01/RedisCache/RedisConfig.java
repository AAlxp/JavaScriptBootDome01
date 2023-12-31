//package com.example.javascriptbootdome01.RedisCache;
//
//import com.fasterxml.jackson.annotation.JsonAutoDetect;
//import com.fasterxml.jackson.annotation.PropertyAccessor;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.springframework.boot.autoconfigure.cache.CacheProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.redis.cache.RedisCache;
//import org.springframework.data.redis.cache.RedisCacheConfiguration;
//import org.springframework.data.redis.cache.RedisCacheManager;
//import org.springframework.data.redis.connection.RedisConnection;
//import org.springframework.data.redis.connection.RedisConnectionFactory;
//import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
//import org.springframework.data.redis.serializer.RedisSerializationContext;
//import org.springframework.data.redis.serializer.RedisSerializer;
//import org.springframework.data.redis.serializer.StringRedisSerializer;
//
//import java.time.Duration;
//
///**
// * @author 李晓鹏
// * @date 2023/9/25 13:43
// * @description:
// */
//@Configuration
//public class RedisConfig {
//
//    @Bean
//    public RedisCacheManager cacheManager(RedisConnectionFactory redisConnectionFactory){
//        RedisSerializer<String> strSerializer = new StringRedisSerializer();
//        Jackson2JsonRedisSerializer jacksonSeial = new Jackson2JsonRedisSerializer(Object.class);
//
//        ObjectMapper om =new ObjectMapper();
//        om.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
//        om.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);
//        jacksonSeial.setObjectMapper(om);
//
//        RedisCacheConfiguration config = RedisCacheConfiguration.defaultCacheConfig()
//                .entryTtl(Duration.ofDays(1))
//                .serializeKeysWith(RedisSerializationContext.SerializationPair.fromSerializer(strSerializer))
//                .serializeValuesWith(RedisSerializationContext.SerializationPair.fromSerializer(jacksonSeial))
//                .disableCachingNullValues();
//
//        RedisCacheManager cacheManager = RedisCacheManager.builder(redisConnectionFactory).cacheDefaults(config).build();
//        return cacheManager;
//    }
//}
