package util;

public class LoginUtil {
    public static boolean loggedInUtil(String[] args){
        String username = ScannerUtil.stringInput("Username:");
        String password = ScannerUtil.stringInput("Password:");
        if(args[0].equals(username) && args[1].equals(password)){
            System.out.println("You logged in System");
            System.out.println("------------------------------------------------------------");
            return  true;
        }else {
            System.out.println("Wrong username or password!");
            System.out.println("------------------------------------------------------------");
            return  false;
        }
    }
}
