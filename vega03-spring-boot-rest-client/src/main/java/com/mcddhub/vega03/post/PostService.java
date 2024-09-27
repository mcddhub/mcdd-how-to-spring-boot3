package com.mcddhub.vega03.post;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * PostService
 *
 * @version 1.0.0
 * @author: caobaoqi1029
 * @date: 2024/9/27 17:16
 */
@Service
@RequiredArgsConstructor
public class PostService {

    private final PostClient postClient;

    public List<Post> findAll() {
        return postClient.getAll();
    }

    public Post findById(Integer id) {
        return postClient.findById(id);
    }

    public Post create(Post post) {
        return postClient.create(post);
    }

    public Post update(Integer id, Post post) {
        return postClient.update(id, post);
    }

    public void delete(Integer id) {
        postClient.delete(id);
    }

}
