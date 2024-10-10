import java.util.Scanner;

public class Task473 {

    public static String getDecimal(StringBuilder number) {
        for (int i = number.length() - 1; i >= 0; i--) {
            if (i % 3 == 0) {
                char temp_for_dot = number.charAt(i + 1);
                number.setCharAt(i + 1, ',');
                for (int j = i + 2; j < number.length() - 1; j++) {
                    char temp = number.charAt(j);
                    //OVERTHOUGHT
                }
            }
        }
        String decimal = number.toString();
        return decimal;
    }

    public static void printDecimal(String number) {
        for (int i = 0; i < number.length(); i++) {
            System.out.print(number.charAt(i));
            if ((number.length() - 1 - i) % 3 == 0 && i != number.length() - 1) {
                System.out.print(",");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter your number: ");
        Scanner scanner = new Scanner(System.in);
        String number = scanner.next();
        printDecimal(number);
    }
}