import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            char lower = Character.toLowerCase(c);

            if (lower >= 'a' && lower <= 'z') {
                if (lower != 'a' && lower != 'e' && lower != 'i' && lower != 'o' && lower != 'u') {
                    count = count + 1;
                }
            }
        }

        System.out.println("Consonants = " + count);
        in.close();
    }
}