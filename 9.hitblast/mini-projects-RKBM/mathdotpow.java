import java.util.Scanner;

class mathdotpow {

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number to power-sum:");
        int num = scanner.nextInt();

        int res = 0;

        while (num != 0) {
            int x = num % 10;

            int powd = 1;
            for (int i = 1; i <= x; i++) {
                powd *= x;
            }
            res += powd;

            num /= 10;
        }

        System.out.println(res);

        scanner.close();
    }
}
