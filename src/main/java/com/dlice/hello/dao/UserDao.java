package com.dlice.hello.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.dlice.hello.model.entity.HelloUser;
import com.dlice.hello.model.request.UserQueryRequest;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface UserDao extends BaseMapper<HelloUser> {

    @Select(value = {" <script>" +
            " SELECT * FROM users" +
            " <where> 1=1 " +
            " <if test=\"username != null\"> AND username like '%${username}%' </if> " +
            " <if test=\"nickname != null\" > AND nickname like '%${nickname}%' </if> " +
            //" <if test=\"beginTime != null &amp;&amp; endTime != null\"> AND createtime between #{beginTime} and #{endTime}</if>" +
            " </where>" +
            " <if test=\"pageNum != null\"> LIMIT #{pageNum}, #{pageSize}</if> " +
            " </script>"})
    List<HelloUser> listUserPage(UserQueryRequest request);


}
