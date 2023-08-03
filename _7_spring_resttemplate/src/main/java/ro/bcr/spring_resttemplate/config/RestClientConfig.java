package ro.bcr.spring_resttemplate.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import ro.bcr.spring_resttemplate.util.ApiKeyInterceptor;

@Configuration
public class RestClientConfig {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplateBuilder()
                .interceptors(new ApiKeyInterceptor())
                .build();
    }
}
