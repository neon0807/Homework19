package org.example.introduction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main3 {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);


        Person person = context.getBean("newPerson", Person.class);
        person.gotIntoTheCar();

        context.close();

    }
}
