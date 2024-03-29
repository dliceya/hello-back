package com.hello.app.cache;

import org.springframework.lang.NonNull;

import java.util.Optional;

/**
 * Abstract cache store.
 *
 * @Date: 2020/9/2 23:01
 * @Author: dlice
 */
public abstract class AbstractCacheStore<K, V> implements CacheStore<K, V> {
    /**
     * Get cache wrapper by key.
     *
     * @param key key must not be null
     * @return an optional cache wrapper
     */
    @NonNull
    abstract Optional<CacheWrapper<V>> getInternal(@NonNull K key);

}
