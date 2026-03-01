public String addbinary(String a,String b){
    int x=a.length()-1;
    int y=b.length()-1;
    int carry=0;
    StringBuilder list=new StringBuilder();
    while(x>=0 || y>=0 || carry!=0){
        int sum=carry;
        if(x>=0){
            sum+=a.charAt(x)-'0';
            x--;
        }
        if(y>=0){
            sum+=b.charAt(y)-'0';
            y--;
        }
        list.append(sum%2);
        carry=sum/2;

    }
    return list.reverse().toString();
}