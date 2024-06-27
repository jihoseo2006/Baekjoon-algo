import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int[] array = new int[5];
      int count = 0;
      int ans = in.nextInt();
      for(int i = 0; i < array.length; i++){
        array[i] = in.nextInt();
      }
      for(int i = 0; i < array.length; i++){
        if (array[i] == ans) {
          count++;
        }
      }
      System.out.println(count);
    }
}