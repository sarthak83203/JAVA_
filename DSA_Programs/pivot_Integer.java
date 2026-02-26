public int pivotelement(int n){
    for(int x=1;x<=n;x++){  //let me try  one as a pivot let me try 2 as a pivot
        int left=0;
        int right=0;
        for(int i=0;i<=x;i++){
            left=left+i;
        }
        for(int i=x;i<=n;i++){
            right=right+i;
        }
        if(left==right){
            return x;
        }

    }
    return -1;
}

//Explanation
//1+2=2+3
//1+2+3=3+4+5....... it is going like this....