import java.util.Scanner;

public class a8q1 
{
    // ques1.A
    public static boolean isPrime(int x) {
        if (x <= 1) return false;

        boolean is = true;

        for (int i = 2; i <= x/2; i++) {
            if (x%i == 0) {
                is = false; 
                break;
            } 
        }

        return is;
    }

    // ques1.B
    public static boolean isPerfect(int x) {
        int sum = 0;

        for (int i = 1; i <= x/2; i++) {
            if (x%i == 0) {
                sum += i;
            } 
        }

        boolean       is = false;
        if (sum == x) is = true;

        return is;
    }

    // ques1.C
    public static int special_sum(int x) {
        int sum = 0;

        for (int i = 1; i <= x; i++) {
            if      (isPrime(i))   sum += i;
            else if (isPerfect(i)) sum += i;    // "either prime or perfect" = XOR
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        
        System.out.println(special_sum(x));
    }
}