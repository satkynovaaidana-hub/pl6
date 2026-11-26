import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        String[] words = text.split(" ");
        String result = "";

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.length() > 0) {
                char first = Character.toUpperCase(word.charAt(0));
                String rest = word.substring(1);
                result = result + first + rest;
            }
            if (i < words.length - 1) {
                result = result + " ";
            }
        }

        System.out.println(result);
        in.close();
    }
}