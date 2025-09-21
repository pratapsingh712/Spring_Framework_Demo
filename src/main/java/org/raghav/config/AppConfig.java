package org.raghav.config;

import org.raghav.Alien;
import org.raghav.Computer;
import org.raghav.Desktop;
import org.raghav.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean
//
//    public Alien alien(@Autowired Computer com)
    public Alien alien(@Qualifier("desktop") Computer com){
        Alien obj = new Alien();
        obj.setAge(25);
        obj.setCom(com);
//        obj.setCom(desktop()); // this is tight coupling
        return obj;
    }


//    @Bean(name={"computer1","computer2","computer3"})
    @Bean
//    @Scope("prototype")
    public Desktop desktop(){
        return new Desktop();
    }

    @Bean
    public Laptop laptop(){
        return new Laptop();
    }

}
