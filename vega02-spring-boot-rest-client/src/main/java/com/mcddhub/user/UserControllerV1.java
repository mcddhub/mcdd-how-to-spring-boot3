package com.mcddhub.user;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * UserController
 *
 * @version 1.0.0
 * @author: caobaoqi1029
 * @date: 2024/9/24 20:15
 */
@RequestMapping("/api/v1/users")
@RestController
@RequiredArgsConstructor
public class UserControllerV1 {

    private final UserRestClient userRestClient;

    @GetMapping
    public List<User> getAll() {
        return userRestClient.getAll();
    }

    @GetMapping("/{id}")
    public User getById(@PathVariable("id") Integer id) {
        return userRestClient.getById(id);
    }

}
