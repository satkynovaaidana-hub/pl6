import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String expr = in.nextLine().trim();
        String[] parts = expr.split(" ");

        int a = Integer.parseInt(parts[0]);
        String op = parts[1];
        int b = Integer.parseInt(parts[2]);
        int result = 0;

        if (op.equals("+")) {
            result = a + b;
        } else if (op.equals("-")) {
            result = a - b;
        } else if (op.equals("*")) {
            result = a * b;
        } else if (op.equals("/")) {
            result = a / b;
        }

        System.out.println(result);
        in.close();
    }
}