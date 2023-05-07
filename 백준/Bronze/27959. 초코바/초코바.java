import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int money = in.nextInt();
        int whole = in.nextInt();
        if((money * 100) - whole >= 0) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}