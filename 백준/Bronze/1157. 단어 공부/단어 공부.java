import  java.util.Scanner;

public class Main {
    public static int[] getAlphabetCount(String str) {
        int[] count = new int[26];
        for(int i=0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if('A' <= ch &&  ch <= 'Z')
                count[ch - 'A']++;
            else count[ch - 'a']++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int[] count = getAlphabetCount(str);

        int maxCount = -1;
        char maxAlpabet = '?';
        boolean flags = false;
        for(int i = 0; i < 26; i++) {
            if(count[i] > maxCount) {
                maxCount = count[i];
                maxAlpabet = (char)('A' + i);
            } else if (count[i] == maxCount) {
                maxAlpabet = '?';
            }
        }

        System.out.println(maxAlpabet);


    }
}