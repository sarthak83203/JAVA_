class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //Now the best way to solve this is to consider either right top element as starting 
        //point or the bottom left as the starting point
        //beacuse by this method we can find out target better and faster according to complexity

        //========This method is restricted by leetcode

        // int row=0;
        // int cols=matrix[0].length-1;

        // while(row<matrix.length && cols>=0){
        //     if(matrix[row][cols]==target){
        //         return true;
        //     }else if(matrix[row][cols]<target){
        //         row++;
        //     }else{
        //         cols--;
        //     }
        // }
        // return false;

        //======Other method now that is Binary search 
        //now here one trick to remember that row=n/cols and cols is equal to n%cols so remember this
        int row=matrix.length;
        int cols=matrix[0].length;
        int low=0;
        int high=row * cols-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int m=mid / cols;
            int n=mid % cols;
            if(matrix[m][n]==target){
                return true;
            }else if(matrix[m][n]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }

        }
        return false;


        
    }
}