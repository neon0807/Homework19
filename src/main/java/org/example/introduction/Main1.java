package org.example.introduction;

import org.example.introduction.transport.Car;
import org.example.introduction.transport.Moto;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main1 {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");

        Moto moto = context.getBean("moto", Moto.class);
        Moto moto1 = context.getBean("moto", Moto.class);

        System.out.println(moto1 == moto);
        System.out.println(moto);
        System.out.println(moto1);

        context.close();
    }
}

