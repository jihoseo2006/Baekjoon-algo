import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String song = "SONGDO";
        String code = "CODE";
        String year = "2023";
        String algo = "ALGORITHM";


        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        if(input.equals(song) ){
            System.out.println("HIGHSCHOOL");
        } else if (input.equals(code)) {
            System.out.println("MASTER");
        } else if (input.equals(year)) {
            System.out.println("0611");
        } else if (input.equals(algo)) {
            System.out.println("CONTEST");
        }

    }
}