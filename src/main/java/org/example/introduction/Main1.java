package org.example.introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main1 {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext1.xml");

        Car car1 = context.getBean("customCar", Car.class);
        Car car2 = context.getBean("customCar", Car.class);

        System.out.println(car1 == car2);
        System.out.println(car1);
        System.out.println(car2);

        context.close();




        ClassPathXmlApplicationContext context1 =
                new ClassPathXmlApplicationContext("applicationContext1.xml");

        Person1 person = context1.getBean("customPerson1", Person1.class);
        person.gotIntoTheCar();

        context.close();
    }
}

