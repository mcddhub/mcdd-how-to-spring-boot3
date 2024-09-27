package com.mcddhub.user;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;

import java.util.List;

/**
 * UserHttpClient 使用 HTTP Interface连接外部服务 几乎不用编写代码就能与另一个服务通信
 *
 * @version 1.0.0
 * @author: caobaoqi1029
 * @date: 2024/9/24 20:14
 */
public interface UserHttpClient {
    @GetExchange("/users")
    List<User> getAll();

    @GetExchange("/users/{id}")
    User getById(@PathVariable("id") Integer id);
}
