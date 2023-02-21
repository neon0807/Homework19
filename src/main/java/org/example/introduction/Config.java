package org.example.introduction;

import org.example.introduction.transport.Moto;
import org.example.introduction.transport.Transport;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public Transport newTransport(){
        return new Moto();
    }
    @Bean
    public Person newPerson(){
        return new Person(newTransport());
    }
}
