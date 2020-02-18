package com.shpl.farefinderbff.config;

import com.shpl.farefinderbff.provider.DataProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class FarefinderbffConfig {
    @Bean
    public WebClient restTemplate(DataProperties dataProperties) {
        return WebClient.create(dataProperties.getBase());
    }

}
