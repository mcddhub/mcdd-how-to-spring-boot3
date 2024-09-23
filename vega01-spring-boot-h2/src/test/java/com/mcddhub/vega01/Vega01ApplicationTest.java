package com.mcddhub.vega01;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class Vega01ApplicationTest {

    @Autowired
    ApplicationContext context;

    @Test
    void contextLoads() {
        assertNotNull(context, "context is null");
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
    }

}