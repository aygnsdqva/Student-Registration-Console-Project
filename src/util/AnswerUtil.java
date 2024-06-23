package util;

import util.sub.AllStudentsUtilSub;
import util.sub.FindStudentsUtilSub;
import util.sub.RegisterUtilSub;

public class AnswerUtil {
    public static void answerNum(int answer) {
        if (answer == 1) {
            RegisterUtilSub.registration();
            AllStudentsUtilSub.showAllStudent();
        } else if (answer == 2) {
            AllStudentsUtilSub.showAllStudent();
        } else if (answer == 3) {
            FindStudentsUtilSub.findStudents();
        }else if(answer == 4){
            UpdateStudentUtil.updateStudent();
        }

    }

}
