package util;

import domain.Student;
import domain.StudentLists;
import util.sub.AggrementUtil;
import util.sub.AllStudentsUtilSub;
import util.sub.UpdateStudentUtilSub;


public class UpdateStudentUtil {
    public static void updateStudent() {
        System.out.println("Students list :");
        AllStudentsUtilSub.showAllStudent();
        int number = 0;
        while (true) {
            number =  ScannerUtil.intInput("Please enter students  number :");
            try {
                if (number <= 0 || number > StudentLists.students.size()) {
                    throw new IndexOutOfBoundsException();
                }
                break;
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Wrong Student's Number! Please enter student's number again:");
            }
        }
        System.out.println("Are you sure you want to change the " + number + ". student's information? ");
        System.out.println();
        boolean aggrement = AggrementUtil.agrrement();
        if (aggrement == false) {
            return;
        }
        System.out.println("What do you want to change? ");

        Student student = StudentLists.students.get(number-1);

        ///////////////////// NAME \\\\\\\\\\\\\\\\\\\\\\\\\
        String changeName = UpdateStudentUtilSub.updatedForString("Name ? (yes or no)", "Updated name: ");
        if(changeName != null) student.setName(changeName);


        ///////////////////// SURNAME \\\\\\\\\\\\\\\\\\\\\\\\\
        String changeSurname = UpdateStudentUtilSub.updatedForString("Surname ? (yes or no)", "Updated Surname: ");
        if(changeSurname != null) student.setSurname(changeSurname);

        ///////////////////// AGE \\\\\\\\\\\\\\\\\\\\\\\\\
        int changeAge = UpdateStudentUtilSub.updatedForInt("Age ? (yes or no)", "Updated Age: ");
        if(changeAge != -1) student.setAge(changeAge);


        ///////////////////// NAME \\\\\\\\\\\\\\\\\\\\\\\\\
        String changeClass = UpdateStudentUtilSub.updatedForString("Class ? (yes or no)", "Updated class: ");
        if(changeClass != null) student.setClassName(changeClass);

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();






    }
}
