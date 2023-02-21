package org.example.introduction.transport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
//@Scope("prototype")
public class Moto implements Transport{

//    @Autowired

    @Override
    public void go() {
        System.out.println("Мотоцикл едет");
    }

    @PostConstruct
    public void init(){
        System.out.println("Class Moto: Init");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("Class Moto: Destroy");
    }
}
