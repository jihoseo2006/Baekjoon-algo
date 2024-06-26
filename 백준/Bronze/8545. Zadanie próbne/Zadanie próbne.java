import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);

      String alp = in.nextLine();
      StringBuffer str = new StringBuffer(alp);

      
      System.out.println(str.reverse());
    }
}