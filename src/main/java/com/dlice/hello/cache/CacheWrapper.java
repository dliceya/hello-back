package com.dlice.hello.cache;

import lombok.*;
import org.joda.time.LocalDateTime;

import java.io.Serializable;

/**
 * Cache wrapper.
 *
 * @param <V> cache value type
 * @Date: 2020/9/2 23:39
 * @Author: dlice
 */
@Data
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
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
