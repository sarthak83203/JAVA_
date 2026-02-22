public int binaryGap(int n){
    String y=Integer.toBinaryString(n);
    int prev=-1; //calculating previous index
    int maxgap=0;  //distance calculate
    for(int i=0;i<y.length;i++){
        if((y.charAt(i)-'0')==1){
            if(prev!=-1){
                maxgap=Math.max(maxgap,i-prev);
            }
        }
        prev=i;

    }
    return maxgap;
}