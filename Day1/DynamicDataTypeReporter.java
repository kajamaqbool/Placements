package Day1;

import java.util.Scanner;
public class DynamicDataTypeReporter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        if(input.equalsIgnoreCase("true") || input.equalsIgnoreCase("false")){
            System.out.println("Boolean");
        }

        else{
            try{
                Integer.parseInt(input);
                System.out.println("Integer");
            } catch(NumberFormatException e1){
                try{
                    Double.parseDouble(input);
                    System.out.println("Double");
                } catch(NumberFormatException e2){
                    System.out.println("String");
                }
            }
        }
        sc.close();
    }
}
