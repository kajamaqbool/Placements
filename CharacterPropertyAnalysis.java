import java.util.Scanner;

public class CharacterPropertyAnalysis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.nextLine().charAt(0);

        if(Character.isLetter(ch)){
            if(Character.isUpperCase(ch)){
                System.out.println("Uppercase Letter");
            } else {
                System.out.println("Lowercase Letter");
            }
        }
        else if(Character.isDigit(ch)){
            System.out.println("Digit");
        }
        else if(Character.isWhitespace(ch)){
            System.out.println("Whitespace");
        }
        else{
            System.out.println("Symbol");
        }
    }
}
