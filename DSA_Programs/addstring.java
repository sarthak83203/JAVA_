public String addString(String num1,String num2){
    StringBuilder sb=new StringBuilder();
    int len1=num1.length();
    int len2=num2.length();
    int carry=0;
    while(len1>=0 || len2>=0 || carry!=0){
        int sum=carry
        if(len1>=0){
            sum=sum+num1.charAt(len1--)-'0';
        }
        if(len2>=0){
            sum=sum+num2.charAt(len2--)-'0';
        }
        sb.append(sum%10);
        carry=sum/10;

    }
    return sb.reverse().toString();
}

//Some Extra Notes
//Converting String to Long
//long m=Long.parseLong(num1);

//Converting Long to string same for INT also
//String m=String.valueOf(num1);