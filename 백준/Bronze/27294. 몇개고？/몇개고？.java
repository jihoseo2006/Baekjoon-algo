import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int time = sc.nextInt();
        int al = sc.nextInt();

        if(time >= 12 && time <= 16 && al == 0) {
            System.out.println(320);
        }
        else {
            System.out.println(280);
        }

    }
}