package com.mcddhub.vega03.user;

/**
 * User
 *
 * @version 1.0.0
 * @author: caobaoqi1029
 * @date: 2024/9/24 20:07
 */
public record User(
        Integer id,
        String name,
        String username,
        String email,
        Address address,
        String phone,
        String website,
        Company company
) {
}
