package com.mcddhub.common.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Address
 *
 * @version 1.0.0
 * @author: caobaoqi1029
 * @date: 2024/9/24 20:08
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Address {
    /**
     * 街道地址
     */
    private String street;
    /**
     * 公寓号或住房号
     */
    private String suite;
    /**
     * 城市
     */
    private String city;
    /**
     * 邮政编码
     */
    private String zipcode;
    /**
     * 地理位置
     */
    private Geo geo;
}
