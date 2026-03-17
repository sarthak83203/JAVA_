public String date_to_binary(String date){
    String [] list=date.split("-");    //it will come in ["2009","05","05"]
    int x=Integer.parseInt(list[0]);
    int y=Integer.parseInt(list[1]);
    int z=Integer.parseInt(list[2]);

    String p=Integer.toBinaryString(x);
    String q=Integer.toBinaryString(y);
    String r=Integer.toBinaryString(z);

    return p+"-"+q+"-"+r;
}