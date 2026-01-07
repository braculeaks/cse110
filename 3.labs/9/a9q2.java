public class a9q2 {
    public static int power(int base, int exponent) {
        if (exponent == 0) 
            return 1;
        
        return base*power(base, exponent-1);
    }
    public static void main(String[] args) {
        int x = power(8,4);
        System.out.println(x);
    }
}