package util.sub;

import domain.Student;
import domain.StudentLists;
import util.ScannerUtil;

public class FindStudentsUtilSub {
    public static  void  findStudents(){
        System.out.println();
        String findingWords = ScannerUtil.stringInput("Please enter the word you are looking for :");
        boolean found = false;
        for (Student student : StudentLists.students ){
            if(student.getName().contains(findingWords) || student.getSurname().contains(findingWords) || student.getClassName().contains(findingWords)){
                System.out.println(student);
                found = true;
            }
        }
        if (!found){
            System.out.println("No student found with the word: " + findingWords);
        }

    }
}
