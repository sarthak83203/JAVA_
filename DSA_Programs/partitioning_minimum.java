public int minimumpartition(String n){
    int compar=0;
    for(int i=0;i<n.length;i++){
        compar=Math.max(compar,n.charAt(i)-'0');

    }
    return compar;
}