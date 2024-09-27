package com.mcddhub.vega03.post;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

import java.util.List;

/**
 * PostClient
 *
 * @version 1.0.0
 * @author: caobaoqi1029
 * @date: 2024/9/24 21:25
 */
@Component
public class PostClient {

    private final RestClient restClient;

    public PostClient(RestClient.Builder builder) {
//        会导致一直返回 100
//        JdkClientHttpRequestFactory factory = new JdkClientHttpRequestFactory();
        this.restClient = builder
                .baseUrl("https://jsonplaceholder.typicode.com")
//                .requestFactory(factory)
                .build();
    }

    public List<Post> getAll() {
        return restClient.get()
                .uri("/posts")
                .retrieve()
                .body(new ParameterizedTypeReference<>() {
                });
    }

    public Post findById(Integer id) {
        return restClient.get()
                .uri("/posts/{id}", id)
                .retrieve()
                .body(Post.class);
    }

    public Post create(Post post) {
        return restClient.post()
                .uri("/posts")
                .contentType(MediaType.APPLICATION_JSON)
                .body(post)
                .retrieve()
                .body(Post.class);
    }

    public Post update(Integer id, Post post) {
        return restClient.put()
                .uri("/posts/{id}", id)
                .contentType(MediaType.APPLICATION_JSON)
                .body(post)
                .retrieve()
                .body(Post.class);
    }

    public void delete(Integer id) {
        restClient.delete()
                .uri("/posts/{id}", id)
                .retrieve()
                .toBodilessEntity();
    }
}
