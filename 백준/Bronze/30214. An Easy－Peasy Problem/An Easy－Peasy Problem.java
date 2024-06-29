import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int s1 = in.nextInt();
      int s2 = in.nextInt();
      
      if(s1*2 >= s2){
        System.out.println("E");
      }
      else {
        System.out.println("H");
      }
    }
}