import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      long s = in.nextLong();
      long n = 0;
      long count = 0;
      for(int i = 1;; i++){
        if(n > s) {
          break;
        }
        n += i;
        count++;
      }
      System.out.println(count - 1);
    }
}