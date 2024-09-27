package com.mcddhub.common.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Company {
    /**
     * 公司名称
     */
    private String name;
    /**
     * 公司宣传口号
     */
    private String catchPhrase;
    /**
     * 公司业务领域
     */
    private String bs;
}