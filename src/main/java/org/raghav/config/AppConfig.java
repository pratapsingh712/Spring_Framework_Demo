package org.raghav.config;

import org.raghav.Desktop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
    @Bean(name="com")
    @Scope("prototype")
    public Desktop desktop(){
        return new Desktop();
    }
}
