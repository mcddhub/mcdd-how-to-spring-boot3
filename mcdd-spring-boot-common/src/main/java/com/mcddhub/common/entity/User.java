package com.mcddhub.common.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
    /**
     * id
     */
    private Integer id;

    /**
     * 用户的姓名
     */
    private String name;

    /**
     * 用户的用户名
     */
    private String username;

    /**
     * 电子邮件地址
     */
    private String email;

    /**
     * 物理地址信息
     */
    private Address address;

    /**
     * 联系电话
     */
    private String phone;

    /**
     * 个人网站或者网页地址
     */
    private String website;

    /**
     * 工作单位信息
     */
    private Company company;
}
