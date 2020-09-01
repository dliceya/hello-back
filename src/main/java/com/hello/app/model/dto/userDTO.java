package com.hello.app.model.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.joda.time.LocalDateTime;

/**
 * @Author: dlice.
 * @Description: UserDTO.
 * @Date:Created in 2020/9/1 23:12.
 * @Modified By:
 */

@Data
@ToString
@EqualsAndHashCode
public class userDTO {
    private Integer id;

    private String username;

    private String nickname;

    private String email;

    private String phone;

    private Boolean isActive;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;
}
