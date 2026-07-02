public class recursion_prac {
    public static int natural(int n){
        if(n==1){
            return 1;

        }
        int fnm1=natural(n-1);
        int fn=n+fnm1;
        return fn;
    }
    public static int power(int x,int n){
        if(n==1){
            return x;
        }
        int y=power(x,n-1);
        return x*y;

    }
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int fnm1=fact(n-1);
        int fn=n * fnm1;
        return fn;
    }
    public static void main(String args[]){
        System.out.println(power(2, 5));

    }
    
}
