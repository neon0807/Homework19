package org.example.introduction;

import org.example.introduction.transport.Car;
import org.example.introduction.transport.Moto;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {


        ClassPathXmlApplicationContext context2 =
                new ClassPathXmlApplicationContext("applicationContext2.xml");

        Moto moto = context2.getBean("moto", Moto.class);
        moto.go();

        context2.close();
        System.out.println("======================");


        ClassPathXmlApplicationContext context3 =
                new ClassPathXmlApplicationContext("applicationContext2.xml");

        Person person = context3.getBean("person", Person.class);
        person.gotIntoTheCar();

        context3.close();

        System.out.println("=====================");

        ClassPathXmlApplicationContext context4 =
                new ClassPathXmlApplicationContext("applicationContext2.xml");

        Car car = context4.getBean("car", Car.class);
        Car car1 = context4.getBean("car", Car.class);

        System.out.println(car1 == car);
        System.out.println(car1);
        System.out.println(car);

        context4.close();



    }
}
