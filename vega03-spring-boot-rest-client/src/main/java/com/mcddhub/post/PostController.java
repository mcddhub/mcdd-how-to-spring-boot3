package com.mcddhub.post;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * PostController
 *
 * @version 1.0.0
 * @author: caobaoqi1029
 * @date: 2024/9/24 21:29
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/posts")
public class PostController {

    private final PostService service;

    @GetMapping
    public List<Post> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Post findById(@PathVariable("id") Integer id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Post create(Post post) {
        return service.create(post);
    }

    @PutMapping("/{id}")
    public Post update(@PathVariable("id") Integer id, @RequestBody Post post) {
        return service.update(id, post);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("id") Integer id) {
        service.delete(id);
    }
}

