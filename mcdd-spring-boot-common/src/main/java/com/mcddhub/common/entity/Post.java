package com.mcddhub.common.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * User
 *
 * @version 1.0.0
 * @author: caobaoqi1029
 * @date: 2024/9/27 17:47
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Post {
    /**
     * id
     */
    private Integer id;
    /**
     * 表示发帖用户的 ID
     */
    private Integer userId;
    /**
     * 表示帖子的标题
     */
    private String title;
    /**
     * 表示帖子的主要内容
     */
    private String body;
}
