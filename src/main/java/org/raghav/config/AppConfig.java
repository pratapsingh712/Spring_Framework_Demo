package org.raghav.config;

import org.raghav.Alien;
import org.raghav.Desktop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
//    @Bean(name={"computer1","computer2","computer3"})
    @Bean(name="com")
//    @Scope("prototype")
    public Desktop desktop(){
        return new Desktop();
    }

    @Bean
    public Alien alien(){
        return new Alien();
    }
}
