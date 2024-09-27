package com.mcddhub.vega04.bin;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;

/**
 * HttpBinController
 *
 * @version 1.0.0
 * @author: caobaoqi1029
 * @date: 2024/9/24 22:19
 */
@Slf4j
@RestController
@RequestMapping("/api/v1/bins")
public class BinController {

    private final RestClient restClient;

    public BinController(RestClient.Builder restClientBuilder) {
        restClient = restClientBuilder.baseUrl("https://httpbin.org").build();
    }

    @GetMapping("/block/{seconds}")
    public String delay(@PathVariable("seconds") int seconds) {
        ResponseEntity<Void> result = restClient
                .get()
                .uri("/delay/" + seconds)
                .retrieve()
                .toBodilessEntity();

        log.info("{} on {}", result.getStatusCode(), Thread.currentThread());

        return Thread.currentThread().toString();
    }

}
