package com.mcddhub.vega01.model;

import org.springframework.data.annotation.Id;

/**
 * Book
 *
 * @version 1.0.0
 * @author: caobaoqi1029
 * @date: 2024/9/22 21:37
 */
public record Book(@Id Integer id, String title, Integer pages, String author) {
}
