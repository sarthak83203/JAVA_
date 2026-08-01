class Solution {
    public int uniquePaths(int m, int n) {
        // int i=0;
        // int j=0;
        // return grid(i,j,m,n);
        int total=m+n-2;
        int choose=Math.min(m-1,n-1);//because the 8c2 and 8c6 gives the same answer we have to choose less one
        
        long ans=1;
        for(int i=1;i<=choose;i++){
            ans*=(total-choose+i);//this is numerator and this is denominator
            ans=ans/i;//this is deniminator 

        }
        return (int)ans;

        

        
    }
    // public long factorial(int h){
    //     long fact=1;
    //     if(h==0){
    //         return 1;
    //     }
    //     for(int i=1;i<=h;i++){
    //         fact=fact*i;
    //     }
    //     return fact;

    // }
    // public int grid(int i,int j,int m,int n){
    //     if(i==m-1 && j==n-1){
    //         return 1;
    //     }else if(i==m||j==n){
    //         return 0;
    //     }
        
    //     int w1=grid(i+1,j,m,n);
    //     int w2=grid(i,j+1,m,n);
    //     return w1+w2;
    // }
}