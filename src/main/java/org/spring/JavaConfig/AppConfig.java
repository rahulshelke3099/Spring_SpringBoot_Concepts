package org.spring.JavaConfig;

import org.example.Desktop;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name="desk1")
    public Desktop desktop() {
        return new Desktop();
    }

//     Multiple names
//    @Bean(name={"desk2","desk3"})
//    public Desktop desktop() {
//        return new Desktop();
//    }

}
