package org.spring.JavaConfig;

//When to Use:
//Use @Bean when:
//
//You need fine-grained control over bean instantiation.
//The object you're configuring is from a third-party library.
//You need to configure beans conditionally or dynamically.
//
//Use @Component when:
//
//You want Spring to automatically detect and manage the bean.
//You’re dealing with custom classes like services, repositories, or controllers.
//Simplicity is preferred over customization of bean creation.

import org.example.Alien;
import org.example.Computer;
import org.example.Desktop;
import org.example.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = "org.example")
public class AppConfig {

//    @Bean
//    @Scope(scopeName = "prototype")
//    public Desktop desktop() {
//        return new Desktop();
//    }

//    @Bean
//    public Alien alien(@Autowired @Qualifier("laptop") Computer comp) {
//        Alien alien=new Alien();
//        alien.setAge(25);
//        alien.setComputer(comp);
//        return alien;
//    }

//     Multiple names
//    @Bean(name={"desk2","desk3"})
//    public Desktop desktop() {
//        return new Desktop();
//    }

//    @Bean
//    @Primary
//    public Desktop desktop() {
//        return new Desktop();
//    }
//
//    @Bean
//    @Lazy
//    public Laptop laptop() {
//        return new Laptop();
//    }

}
