package org.example.introduction.transport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("singleton")
public class Car implements Transport{

    @Autowired

    public void go(){
        System.out.println("Автомобиль едет");
    }
    @PostConstruct
    public void init(){
        System.out.println("Class Car: Init");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("Class Car: Destroy");
    }
}
