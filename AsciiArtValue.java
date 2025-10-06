import java.util.Scanner;

class AsciiArtValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;

        while (true) {
            String line = sc.nextLine();
            if (line.equals("END")) {
                break;
            }
            for(int i=0; i<line.length(); i++) {
                total += (int) line.charAt(i);
            }
        }
        System.out.println(total);
        sc.close();
    }
}