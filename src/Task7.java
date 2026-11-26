import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (c == ' ') {
                result = result + '_';
            } else {
                result = result + c;
            }
        }

        System.out.println(result);
        in.close();
    }
}