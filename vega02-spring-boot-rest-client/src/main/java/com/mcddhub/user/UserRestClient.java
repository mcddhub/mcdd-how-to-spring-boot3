package com.mcddhub.user;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

import java.util.List;

/**
 * UserRestClient 使用 RestClient 连接外部服务需要自己编写代码
 *
 * @version 1.0.0
 * @author: caobaoqi1029
 * @date: 2024/9/24 20:13
 */
@Component
public class UserRestClient {
    private final RestClient restClient;

    public UserRestClient(RestClient.Builder builder) {
        this.restClient = builder
                .baseUrl("https://jsonplaceholder.typicode.com/")
                .build();
    }

    public List<User> getAll() {
        return restClient.get()
                .uri("/users")
                .retrieve()
                .body(new ParameterizedTypeReference<>() {});
    }

    public  User getById(Integer id){
        return restClient.get()
                .uri("/users/{id}", id)
                .retrieve()
                .body(User.class);
    }
}
