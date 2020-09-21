package com.dlice.hello.repository;

import com.dlice.hello.model.user.entity.HelloUser;
import com.dlice.hello.repository.base.BaseRepository;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;

/**
 * @Date: 2020/9/3 21:55
 * @Author: dlice
 */
@Repository
public interface UserRepository extends BaseRepository<HelloUser, Integer> {

    HelloUser getByUsername(@NonNull String username);

}
