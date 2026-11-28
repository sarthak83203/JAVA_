class Solution {
    public int[][] matrixBlockSum(int[][] mat, int k) {

        //=========== VISA,Google OA Questions===========//

        //ye question baas read karne se pata nahi chalega Do dry run on it
        //Inshot jo question me condition diye he uske hisab se loops lagao
        //now see the condition that given in question that starting of row and ending of row
        //same for col also
        //phir starting row se chalu karna he ending row tak jana he and same for col also
        //baad me sabko add karna he

        int m=mat.length;
        int n=mat[0].length;
        int ans[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int sum=0;
                for(int r=Math.max(0,i-k);r<=Math.min(m-1,i+k);r++){//this represendt starting row and ending row
                    //aab Math.max lena ke ye matlab he ki agar maan lo ki i=0 hota he
                    //then -1 index will be invalid so compare with 0 and -1 appears then start with 0
                    //Math.min isliye kyuki i+k will give indexOutOfBound so compare with 
                    //row.length-1 
                    //now same for col
                    for(int c=Math.max(0,j-k);c<=Math.min(n-1,j+k);c++){//This represent starting col and ending col
                        sum+=mat[r][c];
                    }
                }
                ans[i][j]=sum;
            }
        }
        return ans;
        
    }
}