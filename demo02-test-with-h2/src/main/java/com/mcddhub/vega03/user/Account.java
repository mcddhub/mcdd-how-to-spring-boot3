package com.mcddhub.vega03.user;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.OffsetDateTime;

/**
 * Account
 *
 * @version 1.0.0
 * @author: caobaoqi1029
 * @date: 2024/9/22 19:34
 */
@Getter
@Setter
@ToString
@Entity
@Table(name = "account", schema = "backend")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "username", nullable = false)
    private String username;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "avatar")
    private String avatar = "https://2024-cbq-1311841992.cos.ap-beijing.myqcloud.com/picgo/avatar.png";

    @Column(name = "enable", nullable = false)
    private Boolean enable = true;

    @Column(name = "create_time", nullable = false)
    private OffsetDateTime createTime = OffsetDateTime.now();

    @Column(name = "update_time", nullable = false)
    private OffsetDateTime updateTime = OffsetDateTime.now();
}
