package com.dlice.hello.model.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.dlice.hello.model.entity.base.BaseEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import static com.baomidou.mybatisplus.annotation.IdType.AUTO;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@TableName("users")
public class HelloUser extends BaseEntity {
    @TableId(type = AUTO)
    private Integer id;

    /**
     * User name.
     */
    private String username;

    /**
     * User nick name,used to display on page.
     */
    private String nickname;

    /**
     * Password.
     */
    @JsonIgnore
    private String password;

    /**
     * User email.
     */
    @TableField(fill = FieldFill.INSERT)
    private String email;

    /**
     * User phone number.
     */
    @TableField(fill = FieldFill.INSERT)
    private String phone;

    /**
     * User active mark.
     */
    private Boolean isActive;

}
