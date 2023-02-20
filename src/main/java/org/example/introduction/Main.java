package org.example.introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Car car1 = context.getBean("customCar", Car.class);
        car1.go();

        Car car2 = context.getBean("customCar", Car.class);

        System.out.println(car1 == car2);
        System.out.println(car1);
        System.out.println(car2);

        context.close();




        ClassPathXmlApplicationContext context1 =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Person person = context1.getBean("customPerson", Person.class);
        person.gotIntoTheCar();

        context.close();

    }
}
