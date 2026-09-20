class Solution {
    public int tribonacci(int n) {
        //so isme my appproach is Recursion which gives the TLE |
        //kyuki Recursion baar baar piche jake check karta he agar T3,T2,T0 dekha to wapis jakar dekhega

        if(n==0){
            return 0;

        }
        if(n==1||n==2){
            return 1;
        }
        int a=0;//ye T0 ki value he
        int b=1;//ye T1 ki value he
        int c=1;//ye T2 ki value he
        for(int i=3;i<=n;i++){
            int y=a+b+c;
            a=b;
            b=c;
            c=y;//y sabka sum he
        }
        return c;//this is the Nth value which i want
        
    }
}