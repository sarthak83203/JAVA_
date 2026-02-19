public int sumofdigit(int n,int k){
    String result=Integer.parseInt(n,k);   //This converts to any base remember..
    int y=Integer.parseInt(result);
    while(y!=0){
        int r=y%10;
        sum=sum+r;
        y=y/10;
    }
    return sum;

}