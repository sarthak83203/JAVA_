public int divisorSubstring(int num,int k){
    int ui=num;
    int count=0;
    String r=String.valueOf(num);

    for(int i=0;i<=r.length-k;i++){
        String s=r.substring(i,i+k);
        int y=Integer.parseInt(s);
        if(y!=0 && ui%y==0){
            count++;
        }

    }
    return count;

}