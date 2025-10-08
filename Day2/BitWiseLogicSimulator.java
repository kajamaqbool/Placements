package Day2;

import java.util.Scanner;
public class BitWiseLogicSimulator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.nextLine();
        String op = sc.nextLine().trim().toUpperCase();

        switch(op){
            case "AND":
                System.out.println(a & b);
                break;
            case "OR":
                System.out.println(a | b);
                break;
            case "XOR":
                System.out.println(a ^ b);
                break;
            case "NAND":
                System.out.println(~(a & b));
                break;
            case "NOR":
                System.out.println(~(a | b));
                break;
            case "XNOR":
                System.out.println(~(a ^ b));
                break;
            default:
                System.out.println("Invalid Operation");
        }
    }
}
