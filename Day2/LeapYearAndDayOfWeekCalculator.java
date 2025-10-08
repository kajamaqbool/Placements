package Day2;

import java.util.Scanner;
public class LeapYearAndDayOfWeekCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int day = sc.nextInt();
        String isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ? "Leap Year" : "Not a Leap Year";
        System.out.println(isLeap);

        if(isLeap.equals("Leap Year")){
            if(day>=1 || day<=366){
                int a = day % 7;
                String str = " ";
                switch(a){
                    case 1: str = "Monday"; break;
                    case 2: str = "Tuesday"; break; 
                    case 3: str = "Wednesday"; break;
                    case 4: str = "Thursday"; break;
                    case 5: str = "Friday"; break;
                    case 6: str = "Saturday"; break;
                    case 0: str = "Sunday"; break;
                    default: str = "Invalid Day";
                }
                System.out.println(str);
            }
        } else {
            if(day>=1 || day<=365){
                int a = day % 7;
                String str = " ";
                switch(a){
                    case 1: str = "Monday"; break;
                    case 2: str = "Tuesday"; break; 
                    case 3: str = "Wednesday"; break;
                    case 4: str = "Thursday"; break;
                    case 5: str = "Friday"; break;
                    case 6: str = "Saturday"; break;
                    case 0: str = "Sunday"; break;
                    default: str = "Invalid Day";
                }
                System.out.println(str);
            }
        }
    }        
}
