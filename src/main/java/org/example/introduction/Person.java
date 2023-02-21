package org.example.introduction;

import org.example.introduction.transport.Car;
import org.example.introduction.transport.Moto;
import org.example.introduction.transport.Transport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
public class Person {

    private Transport transport;

//    @Autowired
    public Person(Transport transport) {
        this.transport = transport;
    }

    public void gotIntoTheCar(){
        System.out.println("Владелец сел в автомобиль");
        transport.go();

    }
}
