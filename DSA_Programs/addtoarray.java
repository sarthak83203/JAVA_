public List<Integer> addtoarray(int []nums,int k){
    StringBuilder sb=new StringBuilder();
    for(int i:nums){
        s.append(i);

    }
    //Now the concept of BIGINTEGER comes
    BigInteger number=new BigInteger(sb.toString());
    BigInteger io=BigInteger.valueOf(k);  //valueOf does not accept the string
    BigInteger adding=number.add(io);
    String results=String.valueOf(adding);     //String results=adding.toString();
    ArrayList<Integer> list=new ArrayList<>();
    for(int i=0;i<results.length();i++){
        list.add(results.charAt(i)-'0');   //converting each characters to integer.....

    }
    return list;

}