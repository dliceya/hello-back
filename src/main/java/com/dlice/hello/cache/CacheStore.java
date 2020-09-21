package com.dlice.hello.cache;

import org.springframework.lang.NonNull;

import java.util.Optional;
import java.util.concurrent.TimeUnit;

/**
 * Cache store interface.
 *
 * @param <K> cache key type
 * @param <V> cache value type
 * @Date: 2020/9/2 22:50
 * @Author: dlice
 */
public interface CacheStore<K, V> {

    /**
     * Gets by cache key.
     *
     * @param key must not be null
     * @return cache value
     */
    @NonNull
    Optional<V> get(@NonNull K key);

    /**
     * 设置一个有过期时间的缓存
     *
     * @param key      cache key 不能为空
     * @param value    cache value 不能为空
     * @param timeout  the key expiration must not be less than 1
     * @param timeUnit timeout unit
     */
    void put(@NonNull K key, @NonNull V value, long timeout, @NonNull TimeUnit timeUnit);

    /**
     * 设置一个不会过期的缓存
     *
     * @param key      cache key 不能为空
     * @param value    cache value 不能为空
     */
    void put(@NonNull K key, @NonNull V value);

    /**
     * 删除缓存
     *
     * @param key cache key 不能为空
     */
    void delete(@NonNull K key);

    /**
     * 清空缓存
     */
    void clare();

}
