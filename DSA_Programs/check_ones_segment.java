public boolean check_ones_segment(String s){
    // return !s.contains("01");  String also have a "contains"

    char [] c=s.toCharArray();
    for(int i=0;i<c.length-1;i++){
        if(c[i]=='0' && c[i+1]=='1'){
            return false;
        }
    }
    return true;
}


//Atmost
//Explnation=>1001 like atmost ones so '1' segment started then again '1' segment came so false as we compare with the string "01".....