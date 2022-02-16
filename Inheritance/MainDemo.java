package Inheritance;

import java.util.Scanner;

public class MainDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Person person = new Person("kris", "HD");
        Student student = new Student("KK", "HD");
        Employee employee = new Employee("Kk", "HD");

        System.out.println(person.getAddress());
        System.out.println(person.getName());
        student.setSchool("VA");
        System.out.println(student.getSchool());
        employee.setCompany("HZ");
        System.out.println(employee.getCompany());
        System.out.println(employee.getAddress());


    }
}
