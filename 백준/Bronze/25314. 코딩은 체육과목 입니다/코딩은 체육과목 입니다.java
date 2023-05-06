import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int count = num / 4;
        while(count != 0) {
            System.out.printf("long ");
            count--;
        }
        System.out.printf("int");
    }
}