package org.example.introduction;

import org.example.introduction.transport.Car;

public class Person1 {
    private Car car;

    public void setCar(Car car) {
        this.car = car;

    }

    public void gotIntoTheCar(){
        System.out.println("Владелец сел в автомобиль");
        car.go();

    }
}

