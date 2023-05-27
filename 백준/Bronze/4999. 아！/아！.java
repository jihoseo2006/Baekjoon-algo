import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String jae = in.nextLine();
        String doc = in.nextLine();

        if(jae.length() >= doc.length()) {
            System.out.println("go");
        }
        else {
            System.out.println("no");
        }
    }
}