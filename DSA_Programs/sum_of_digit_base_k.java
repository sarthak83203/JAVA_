public int sumofdigit(int n,int k){
    String result=Integer.parseInt(n,k);   //This converts to any base remember..
    //one more you should know about this if the n is given in integer then do this
    //String h=Integer.toString(n);    //remember this also
    int y=Integer.parseInt(result);
    while(y!=0){
        int r=y%10;
        sum=sum+r;
        y=y/10;
    }
    return sum;

}