public boolean binary_alter_daily(int n){
    String u=Integer.toBinaryString(n);
    boolean isper=true;
    for(int i=0;i<u.length()-1;i++){
        if(((u.charAt(i))-'0')==((u.charAt(i+1))-'0')){
            isper=false;
            break;
        }
    }
    if(isper){
        return true;
    }
    return false;
}