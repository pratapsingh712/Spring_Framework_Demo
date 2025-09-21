package org.raghav.config;

import org.raghav.Desktop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean(name="com")
    public Desktop desktop(){
        return new Desktop();
    }
}
