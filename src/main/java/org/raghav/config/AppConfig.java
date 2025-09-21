package org.raghav.config;

import org.raghav.Desktop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Desktop desktop(){
        return new Desktop();
    }
}
