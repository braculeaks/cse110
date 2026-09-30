import java.util.Scanner;

public class digitprintorder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // This code basically prints the individual digits in an integer, but in the "correct" order in which they're placed
        // inside the integer from left to right.

        System.out.println("Enter the number:");
        int num = scanner.nextInt();
        int digits = 0;

        int dupe = num;
        while (dupe != 0) {
            digits++;
            dupe /= 10;
        }

        int currentdivisor = 1;
        for (int ten = 1; ten < digits; ten++) {
            currentdivisor *= 10;
        }

        int lastdivisor = 0;
        while (digits != 0) {
            int x;
            if (lastdivisor == 0) {
                x = num / currentdivisor;
            } else {
                x = (num % lastdivisor) / currentdivisor;
            }
            lastdivisor = currentdivisor;
            currentdivisor /= 10;
            digits--;

            System.out.println(x);
        }

        scanner.close();
    }
}
