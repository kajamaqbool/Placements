package Day1;

import java.util.Scanner;

public class DelimitedDataExtraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String[] parts = input.split("\\|\\|");

        String name = parts.length >0 ? parts[0] : "";
        String age = parts.length >1 ? parts[1] : "";
        String city = parts.length >2 ? parts[2] : "";

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);  
        System.out.println("City: " + city);
        sc.close();
    }
    
}
