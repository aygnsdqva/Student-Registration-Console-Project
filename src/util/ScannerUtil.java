package util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerUtil {

    public  static String stringInput(String title){
        System.out.println(title);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public  static  int intInput(String title){
        Scanner scanner = new Scanner(System.in);
        int input = -1;
        boolean valid = false;
        while (!valid){
            System.out.println(title);
            try {
                input = scanner.nextInt();
                valid = true;
            }catch (InputMismatchException e){
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
            }
        }
        return  input;
    }
}
