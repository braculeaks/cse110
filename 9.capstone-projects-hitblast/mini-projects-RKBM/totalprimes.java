import java.util.Scanner;

public class totalprimes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the starting number:");
        int start = scanner.nextInt();
        System.out.println("Enter the ending number:");
        int end = scanner.nextInt();

        int primes = 0;

        for (int i = start; i <= end; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }

            if (count <= 2) {
                primes++;
            }
        }

        System.out.println("Prime number count: " + primes);

        scanner.close();
    }
}
