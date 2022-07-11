import java.util.Scanner;

public class Calculator {

    public static void main(String... args) {

        int num1;
        int num2;

        Scanner scan = new Scanner(System.in);
        System.out.println("Calculator");

        num1 = scan.nextInt();
        String str = scan.next();
        num2 = scan.nextInt();
        System.out.print(("Calculation is " + calculate(num1, str, num2)));
        scan.close();

    }

    private static int calculate(int num1, String str, int num2) {

        switch (str.charAt(0)) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                return num1 / num2;

        }
        return calculate(num1, str, num2);

    }
}