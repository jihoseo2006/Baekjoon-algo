import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int rcount = 0;
      int count = in.nextInt();
      for (int i = 0; i< count; i++){
        int n = in.nextInt();
        if(n ==1 ){
          rcount+= 1;
        }
      }
      if((count/2) < rcount){
        System.out.println("Junhee is cute!");
      }
      else {
        System.out.println("Junhee is not cute!");
      }
    }
}
