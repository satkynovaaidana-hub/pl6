import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        char answer = 0;
        boolean found = false;

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            int repeats = 0;

            for (int j = 0; j < text.length(); j++) {
                if (text.charAt(j) == c) {
                    repeats = repeats + 1;
                }
            }

            if (repeats == 1) {
                answer = c;
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(answer);
        } else {
            System.out.println("None");
        }

        in.close();
    }
}