package com.jsp.chap05;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        JdbcBasic jdbc = new JdbcBasic();

//        jdbc.insert(new Person(99, "고길동", 30));
//        jdbc.insert(new Person(200, "강하쥐", 45));
//        jdbc.insert(new Person(300, "고영희", 70));

//        jdbc.delete(200);
//        jdbc.delete(99);

        jdbc.update(300, "고영희", 333);

        jdbc.findAll();

        List<Person> people = jdbc.findAll();
        System.out.println("people = " + people);

    }
}
