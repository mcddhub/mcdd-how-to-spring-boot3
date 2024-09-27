package com.mcddhub.vega03.config;

import com.mcddhub.common.utils.Const;
import com.mcddhub.vega03.user.UserHttpClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.support.RestClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

/**
 * UserConfiguration
 *
 * @version 1.0.0
 * @author: caobaoqi1029
 * @date: 2024/9/27 17:42
 */
@Configuration
public class UserConfiguration {
    @Bean
    UserHttpClient userHttpClient() {
        RestClient client = RestClient.builder()
                .baseUrl(Const.JSON_PLACEHOLDER_BASE_URL)
                .build();
        HttpServiceProxyFactory factory = HttpServiceProxyFactory.builderFor(RestClientAdapter.create(client)).build();
        return factory.createClient(UserHttpClient.class);
    }
}
