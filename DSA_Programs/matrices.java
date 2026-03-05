public int[] matrices(int [][] grid){
    int m=grid.length;
    int n=grid[0].length;
    int total=m*n;
    int freq[]=new int[total+1];     //Calculating a frequency new easy method....

    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            freq[grid[i][j]]++;
        }
    }
        //index : 1 2 3 4
        //value : 1 2 1 0
    
    int repeated=-1;
    int missing=-1;

    for(int i=1;i<=total;i++){
        if(freq[i]==2){
            repeated=i;
        }
        if(freq[i]==0){
            missing=i;
        }
    }

    return new int[]{repeated,misssing};
}