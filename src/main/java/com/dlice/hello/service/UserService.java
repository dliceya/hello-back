package com.dlice.hello.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dlice.hello.model.entity.HelloUser;
import org.springframework.stereotype.Service;

/**
 * @Date: 2020/9/21 22:30
 * @Author: dlice
 */
@Service
public interface UserService extends IService<HelloUser> {

}
