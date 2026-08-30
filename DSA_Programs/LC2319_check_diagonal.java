class Solution {
    public boolean checkXMatrix(int[][] grid) {
        //secondary matrix diagonal condition is i+j=n-1;
        int m=grid.length;
        int n=grid[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==j || i+j==n-1){//ye pehele to diagonal check karo easy padega
                    if(grid[i][j]<=0){
                        return false;
                    }
                }else{
                    if(grid[i][j]!=0){
                        return false;
                    }
                }
            }
        }
        return true;

        
    }
}