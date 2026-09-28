public class a8q2 {
    public static void showDots(int x) {
        for (int i = 0; i < x; i++) System.out.print(".");
    }
    public static void show_palindrome(int x) {
        for (int i = 1  ; i <= x; i++) System.out.print(i);
        for (int i = x-1; i >  0; i--) System.out.print(i);
    }
    public static void showDiamond(int x) {
        for (int i = 1; i < x; i++) {       // i = 1,2,3,4...
            showDots(x-i);
            show_palindrome(i);
            showDots(x-i);
            System.out.println();
        }
        show_palindrome(x);  System.out.println();
        for (int i = x-1; i > 0; i--) {     // i = 4,3,2,1...
            showDots(x-i);
            show_palindrome(i);
            showDots(x-i);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        showDiamond(5);
    }
}
