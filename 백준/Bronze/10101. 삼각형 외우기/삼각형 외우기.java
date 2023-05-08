import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int fir = in.nextInt();
        int sec = in.nextInt();
        int thi = in.nextInt();

        if(fir == 60 && (fir == sec && sec == thi)){
            System.out.println("Equilateral");
        } else if ((fir + sec + thi == 180) && (fir == sec || sec == thi || thi == fir) ) {
            System.out.println("Isosceles");
        } else if ((fir + sec + thi == 180) && (fir != sec && sec != thi && thi != fir) ) {
            System.out.println("Scalene");
        }
        else {
            System.out.println("Error");
        }
    }
}