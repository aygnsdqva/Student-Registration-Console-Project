package util.sub;

import domain.Student;
import domain.StudentLists;
import util.ScannerUtil;

import java.util.ArrayList;

public class RegisterUtilSub {
    public static void registration() {
        System.out.println("You have selected 1 : Registered Students");
        System.out.println("How many students do you want to register?");
        int count = ScannerUtil.intInput("Enter the count: ");
        System.out.println("You have selected a count value of " + count);
        System.out.println();
        for (int i = 0; i < count; i++) {
            System.out.println("You are registering the " + (i + 1) + ". student");
            String name = ScannerUtil.stringInput(i + 1 + ". Student's name:");
            String surname = ScannerUtil.stringInput(i + 1 + ". Student's surname:");
            int age = ScannerUtil.intInput(i + 1 + ". Student's age:");
            String className = ScannerUtil.stringInput(i + 1 + ". Student's class:");
            Student student = new Student(name, surname, age, className);
            StudentLists.students.add(student);
        }
    }
}
