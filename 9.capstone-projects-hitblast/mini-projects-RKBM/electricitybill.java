import java.util.Scanner;

public class electricitybill {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter units of electricity:");
        int units = scanner.nextInt();
        int taka = 0;

        int a = Math.min(units, 100);
        taka += a * 5;

        if (units > 100) {
            int b = Math.min(units, 200) - 100;
            taka += b * 7;
        }

        if (units > 200) {
            int c = units - 200;
            taka += c * 10;
        }

        System.out.println("Total taka: " + taka);

        scanner.close();
    }
}
