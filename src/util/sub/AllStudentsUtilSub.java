package util.sub;

import domain.Student;
import domain.StudentLists;

public class AllStudentsUtilSub {

    public static void showAllStudent() {
        if (StudentLists.students.isEmpty()) {
            System.out.println("No students have registered yet");
            return;
        }
        System.out.println("Registered students are:");
        for (int i = 0; i < StudentLists.students.size(); i++) {
            Student student = StudentLists.students.get(i);
            System.out.println(i+1+ ". student is  " +  student);
        }
    }
}
