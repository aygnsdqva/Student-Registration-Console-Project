package util.sub;

import util.ScannerUtil;

public class AggrementUtil {
    public  static  boolean agrrement(){
        String input = ScannerUtil.stringInput("Enter yes or no ");
        System.out.println(input);
        while(!input.equalsIgnoreCase("yes") && !input.equalsIgnoreCase("no")){
            input = ScannerUtil.stringInput("Wrong input ! Enter just yes or no ");
        }
        if(input.equalsIgnoreCase("no")){
            System.out.println("Ok, redirecting main page...");
            return false;
        }
        return true;
    }
}
