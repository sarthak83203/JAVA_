class Solution {
    public int countServers(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int row[]=new int[grid.length];//abhi row me dekho kitne he  ek ek row check karo
        int col[]=new int[grid[0].length];//abhi col me dekho adjacent doesn't matter
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                row[i]+=grid[i][j];//row me kitne 1 he usko add kiya  adjacent ka koi case nahi
                col[j]+=grid[i][j];//col me calculate kiya 
            }
        }
        //kyuki hame row and col dono me dekhna he isliye
        int ans=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1 && (row[i]>1 || col[j]>1)){
                    ans++;
                }
            }
        }
        return ans;
        
    }
}