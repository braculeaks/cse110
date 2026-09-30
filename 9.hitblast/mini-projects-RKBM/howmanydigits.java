import java.util.Scanner;

public class howmanydigits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = scanner.nextInt();
        int digits = 0;

        while (num != 0) {
            digits++;
            num /= 10;
        }
        System.out.println("This number has " + digits + " digits.");

        scanner.close();
    }
}
