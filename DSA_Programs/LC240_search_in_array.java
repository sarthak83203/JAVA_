class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //isme vohi approach use kiya he like right most right coner and 
        //and leftmost down corner inmese koi bhi choose karu to answer aa jayega easily
        int row=0;
        int col=matrix[0].length-1;
        while(row<matrix.length && col>=0){
            if(matrix[row][col]==target){
                return true;
            }
            if(matrix[row][col]<target){
                row++;
                
            }else{
                col--;
            }

        }
        return false;


        
    }
}