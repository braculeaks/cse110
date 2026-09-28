public class a8q4_tracing {
    public static void main (String[] args){
        int a = 4, b = 7;
        System.out.println(methodA(a,b));
    }   
    public static double methodA(int m, int n){
        int p = m+n-23, s = 0;
        if (p<0){
            System.out.println(p);
            System.out.println(methodB(p+10));
            s = methodB(p-10);
        }
        System.out.println(--s);
        return p*m+s;
    }    
    public static int methodB(int r){
        int q = 6;
        System.out.println(++r + q);
        return q-r;
    }
}
