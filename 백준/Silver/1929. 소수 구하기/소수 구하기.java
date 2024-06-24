import java.sql.Array;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      int m = sc.nextInt();
      int n = sc.nextInt();
      int[] array = new int[1000001];

      for (int i = 2; i < 1000001; i++){
        array[i] = 1;
      }

      for(int i = 2; i <= n; i++){
        for(int j = i * 2; j <= n; j+=i){
          array[j] = 0;
        }
      }

      for(int i = m; i <= n; i++){
        if(array[i] == 1){
          System.out.println(i);
        }
      }
    }
}