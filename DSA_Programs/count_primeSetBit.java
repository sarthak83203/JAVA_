public int count_primeSetBits(int left,int right){
    for(int i=left;i<=right;i++){
        int count=0;
        String bi=Integer.toBinaryString(i);

        for(int j=0;j<bi.length();j++){
            if((bi.charAt(j))-'0'==1){
                count++;
            }
        }
        if(isprime(count)){
            result++;
        }

    }
    return result;

}
//logic build
public boolean isprime(int n){
    if(n<2){
        return false;
    }
    for(int i=2;i * i<=n;i++){
        if(n%i==0){
            return false;
        }
    }
    return true;
}