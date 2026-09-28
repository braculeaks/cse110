import java.util.Scanner;

public class a8q3 {
    public static double calcTax(int age, int salary) {
        if (age < 18) return 0;
        else if (salary <  10000) return 0;
        else if (salary <= 20000) return salary*0.07;
        else                      return salary*0.14;
    }

    public static void calcYearlyTax() {
        Scanner sc    = new Scanner(System.in);
        int     age   = sc.nextInt();
        double  total = 0;

        for (int i = 1; i <= 12; i++) {
            int salary_ThisMonth = sc.nextInt();
            double tax_ThisMonth = calcTax(age, salary_ThisMonth);
            total += tax_ThisMonth;

            System.out.println("Month" + i + " tax: " + tax_ThisMonth);
        }

        System.out.println("Total Yearly Tax: " + total);
    }

    public static void main(String[] args) {
        calcYearlyTax();
    }
}
