import java.util.Scanner;

public class Main {
  static int all = 0;

    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      for(int i = 0; i< 3; i++) {
        int n1 = in.nextInt();
        if(n >= n1){
          all += n1;
        } else {
          all += n;
        }
      }
      System.out.println(all);
    }
}