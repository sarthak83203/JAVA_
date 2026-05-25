public int segments(String s){
    s=s.trim();  //this removes the space of first and end
    if(s.length()==0){
        return 0;
    }
    String i[]=s.split("\\s+");  //  "\\s" means whitespace + means one or more can use for exactly one space also
    return i.length;

}