import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        String[] words = text.split(" ");
        String longest = "";

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > longest.length()) {
                longest = words[i];
            }
        }

        System.out.println(longest);
        in.close();
    }
}