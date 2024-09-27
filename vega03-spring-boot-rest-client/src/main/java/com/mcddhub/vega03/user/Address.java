package com.mcddhub.vega03.user;

/**
 * Address
 *
 * @version 1.0.0
 * @author: caobaoqi1029
 * @date: 2024/9/24 20:08
 */
public record Address(
        String street,
        String suite,
        String city,
        String zipcode,
        Geo geo
) {
}
