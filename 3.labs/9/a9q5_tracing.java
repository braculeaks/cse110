public class a9q5_tracing {
    public static String fun(String s, int n)
    {
        if(s.length()==4) {
            return n+s+n;
        } 
        else if(n%2==0)
        {
            System.out.println(s+n+n+3);
            String p = s+n;
            return fun(p, n+3);
        } 
        else 
        {
            System.out.println(s+n+(n-1));
            String p = s+n;
            return fun(p, n-1);
        }
    }
    public static void main(String[] args){
        String s = fun("", 1);
        System.out.println(s);
    }
}