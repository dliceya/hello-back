package com.hello.app.repository;

import com.hello.app.model.entity.HelloUser;
import com.hello.app.repository.base.BaseRepository;
import org.springframework.lang.NonNull;

/**
 * @Date: 2020/9/3 21:55
 * @Author: dlice
 */
public interface UserRepository extends BaseRepository<HelloUser, Integer> {

    HelloUser getByUsername(@NonNull String username);
}
