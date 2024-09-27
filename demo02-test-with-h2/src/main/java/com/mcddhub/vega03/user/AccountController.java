package com.mcddhub.vega03.user;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * AccountController
 *
 * @version 1.0.0
 * @author: caobaoqi1029
 * @date: 2024/9/22 19:43
 */
@RequestMapping("/api/v1/accounts")
@RestController
@RequiredArgsConstructor
public class AccountController {
    private final AccountRepository repository;

    @GetMapping
    List<Account> getAccounts() {
        return repository.findAll();
    }
}
