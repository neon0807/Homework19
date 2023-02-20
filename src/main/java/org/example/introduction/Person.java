package org.example.introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Person {

    private Car car;

    public Person(Car car) {
        this.car = car;
    }


    public void gotIntoTheCar(){
        System.out.println("Владелец сел в автомобиль");
        car.go();

    }
}
