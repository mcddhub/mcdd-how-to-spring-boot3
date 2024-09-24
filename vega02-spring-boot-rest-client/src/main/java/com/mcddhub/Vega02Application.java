package com.mcddhub;

import com.mcddhub.user.UserHttpClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.support.RestClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

@SpringBootApplication
public class Vega02Application {
    public static void main(String[] args) {
        SpringApplication.run(Vega02Application.class, args);
    }

    @Bean
    UserHttpClient userHttpClient() {
        RestClient client = RestClient.builder().baseUrl("https://jsonplaceholder.typicode.com").build();
        HttpServiceProxyFactory factory = HttpServiceProxyFactory.builderFor(RestClientAdapter.create(client)).build();
        return factory.createClient(UserHttpClient.class);
    }
}