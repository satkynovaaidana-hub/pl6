import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        String newtext = "";

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            c = Character.toUpperCase(c);
            newtext = newtext + c;
        }

        System.out.println(newtext);
        in.close();
    }
}
