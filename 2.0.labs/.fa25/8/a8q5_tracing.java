public class a8q5_tracing {
    public static boolean met1(int n1, int n2){
        System.out.println("Method 1");
        int n = n1+n2;
        System.out.println(n);
        return met3(n, n2)>n1;
    }
    public static int met2(int n, String s){
        int p = 5;
        System.out.println("Method 2");
        System.out.println(met1(n,p));
        return s.length();
    } 
    public static double met3(int n, int p){
        System.out.println("Method 3");
        System.out.println(n/p);
        return p;
    }
    public static void main (String[] args){
        System.out.println("Main Method");
        System.out.println(met2(6,"ABC"));
    }
}
