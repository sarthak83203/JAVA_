public boolean check_string(String s,int k){
    HashSet<Integer> list=new HashSet<>();
    for(int i=0;i<=s.length()-k;i++){
        list.add(s.substring(i,i+k));

    }
    return list.size()==Math.pow(2,k);

}