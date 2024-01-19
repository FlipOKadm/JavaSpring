package ru.otus.spring01;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.otus.spring01.domain.Person;
import ru.otus.spring01.service.PersonService;

public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/context.xml");
        PersonService s = context.getBean(PersonService.class);
        s.getPerson();
//        Person ivan = null;
//        System.out.println("name: " + ivan.getName() + " age: " + ivan.getAge());
    }
}
