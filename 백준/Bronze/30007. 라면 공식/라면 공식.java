import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      for(int i = 0; i < n; i++){
        int a = in.nextInt();
        int b = in.nextInt();
        int x = in.nextInt();
        System.out.println(a * (x-1) + b);
      }
    }
}