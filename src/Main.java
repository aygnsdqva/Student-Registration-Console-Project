import domain.Student;
import domain.StudentLists;
import jdk.nashorn.internal.ir.WhileNode;
import util.AnswerUtil;
import util.LoginUtil;
import util.ScannerUtil;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, welcome back");
        System.out.println("Please enter username and password");
        boolean loggedIn = LoginUtil.loggedInUtil(args);
        int answer = 0;

        while (!loggedIn) {
            System.out.println("Please try again");
            loggedIn = LoginUtil.loggedInUtil(args);
        }
        while (true) {
            answer = ScannerUtil.intInput("What do you want ? \n" +
                    "1: Registration Students \n" +
                    "2: Show All Students \n" +
                    "3: Find Student \n" +
                    "4: Update Student");
            AnswerUtil.answerNum(answer);

        }
    }
}