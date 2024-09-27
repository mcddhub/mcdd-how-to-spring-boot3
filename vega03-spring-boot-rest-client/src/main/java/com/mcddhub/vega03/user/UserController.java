package com.mcddhub.vega03.user;

import com.mcddhub.common.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * UserControllerV2
 *
 * @version 1.0.0
 * @author: caobaoqi1029
 * @date: 2024/9/24 20:34
 */
@RequestMapping("/api/users")
@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserHttpClient userHttpClient;

    @GetMapping
    public List<User> getAll() {
        return userHttpClient.getAll();
    }

    @GetMapping("/{id}")
    public User getById(@PathVariable("id") Integer id) {
        return userHttpClient.getById(id);
    }
}
