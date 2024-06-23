package util.sub;

import util.ScannerUtil;

public class UpdateStudentUtilSub {
    public  static String updatedForString(String title1, String title2){
        String input = ScannerUtil.stringInput(title1);
        while(!input.equalsIgnoreCase("yes") && !input.equalsIgnoreCase("no")){
            input = ScannerUtil.stringInput("Wrong input ! Enter just yes or no ");
        }
        if(input.equalsIgnoreCase("no")){
            return  null ;
        }
        if(input.equalsIgnoreCase("yes")){
            String change = ScannerUtil.stringInput(title2);
            return  change;
        }
        return  null;
    }

    public  static int updatedForInt(String title1, String title2){
        String input = ScannerUtil.stringInput(title1);
        while(!input.equalsIgnoreCase("yes") && !input.equalsIgnoreCase("no")){
            input = ScannerUtil.stringInput("Wrong input ! Enter just yes or no ");
        }
        if(input.equalsIgnoreCase("no")){
            return -1;
        }
        if(input.equalsIgnoreCase("yes")){
            int change = ScannerUtil.intInput(title2);
            return  change;
        }
        return  -1;
    }
}
