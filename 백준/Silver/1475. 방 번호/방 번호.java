import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);


      String str = in.nextLine();
      str = str.replace('9', '6');
      int[] intArr = new int[9];
      int max = 0;
        
      for(int i = 0; i < str.length() ; i++) {
        int num = (int)(str.charAt(i)-48);
        intArr[num]++;
      }
      
      if(intArr[6]!=0)
        intArr[6]=Math.round(intArr[6]/2.0f);
      
      for(int i = 0; i < intArr.length; i++) {
        max = Math.max(intArr[i], max);
      }

      System.out.println(max);
    }
}
