public int concatenatedBinary(int n){
    String str="";
    int mod=1000000007;   //this is a important
    for(int i=1;i<=3;i++){
        str=str+Integer.toBinaryString(i);
        long t=Long.parseLong(str,2);
        val=val%mod;
        str=Long.toBinaryString(val);
    }
    return (int)Long.parseLong(str,2);   //this is binary to decimal 

}

//now in this question or any other question 
//1)convert to BinaryString
//2)Then take its decimal