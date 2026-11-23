import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = in.nextLine();

        String uppercaseText = text.toUpperCase();
        System.out.println(uppercaseText);

        in.close();
    }
}
