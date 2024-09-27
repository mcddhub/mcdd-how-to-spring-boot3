package com.mcddhub.vega03.post;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mcddhub.common.entity.Post;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.client.RestClientTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.client.MockRestServiceServer;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.requestTo;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withSuccess;

@RestClientTest(PostClient.class)
class PostClientTest {

    @Autowired
    PostClient postClient;

    @Autowired
    MockRestServiceServer server;

    @Autowired
    ObjectMapper objectMapper;

    @Test
    void should_get_all_posts() throws JsonProcessingException {
        // given
        List<Post> data = List.of(
                new Post(1, 1, "Hello World", "This is my first post"),
                new Post(2, 1, "Testing Rest Client with @RestClientTest", "This is a post about testing RestClient calls")
        );
        // when
        this.server
                .expect(requestTo("https://jsonplaceholder.typicode.com/posts"))
                .andRespond(withSuccess(objectMapper.writeValueAsString(data), MediaType.APPLICATION_JSON));
        // then
        List<Post> posts = postClient.getAll();
        assertThat(posts.size()).isEqualTo(2);
        assertThat(posts.get(0)).usingRecursiveComparison().isEqualTo(data.get(0));
        assertThat(posts.get(1)).usingRecursiveComparison().isEqualTo(data.get(1));
    }
}