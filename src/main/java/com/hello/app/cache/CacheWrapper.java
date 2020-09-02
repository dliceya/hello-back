package com.hello.app.cache;

import org.joda.time.LocalDateTime;

import java.io.Serializable;

/**
 * @Date: 2020/9/2 23:39
 * @Author: dlice
 */
public class CacheWrapper<V> implements Serializable {
    /**
     * Cache data
     */
    private V data;

    /**
     * Expired time.
     */
    private LocalDateTime expireAt;

    /**
     * Create time.
     */
    private LocalDateTime createAt;
}
