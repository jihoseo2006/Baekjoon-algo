import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        String name1 = "NLCS";
        String name2 = "BHA";
        String name3 = "KIS";
        String name4 = "SJA";
        if(name.equals(name1)){
            System.out.println("North London Collegiate School");
        } else if (name.equals(name2)) {
            System.out.println("Branksome Hall Asia");
        } else if (name.equals(name3)) {
            System.out.println("Korea International School");
        }
        else if (name.equals(name4)) {
            System.out.println("St. Johnsbury Academy");
        }
    }
}