class Solution {
    public static boolean isSafe(char sudoku[][],int row,int col,char digit){
        //row constant 
        for(int j=0;j<9;j++){
            if(sudoku[row][j]==digit){
                return false;

            }

        }

        //col constant
        for(int i=0;i<9;i++){
            if(sudoku[i][col]==digit){
                return false;
            }
        }

        //grid check
        int sr=(row/3)*3;
        int sc=(col/3)*3;
        for(int i=sr;i<sr+3;i++){
            for(int j=sc;j<sc+3;j++){
                if(sudoku[i][j]==digit){
                    return false;
                }
            }

        }
        return true;
    }

    public static boolean SudokuSolver(char[][] sudoku,int row,int col){
        //base case
        if(row==9){
            return true;
        }


        //recursion
        int nextRow=row;
        int nextCol=col+1;
        if(col+1==9){
            nextRow=row+1;
            nextCol=0; 
        }

        if(sudoku[row][col]!='.'){
            return SudokuSolver(sudoku,nextRow,nextCol);
        }

        for(int i=1;i<=9;i++){
            char digit=(char)(i+'0'); //remember this we can't write like (char)1 it will not give correct answer 
            
            if(isSafe(sudoku,row,col,digit)){
                sudoku[row][col]=digit;
                if(SudokuSolver(sudoku,nextRow,nextCol)){//if the solution exists
                   return true;

                }
                sudoku[row][col]='.';

            }
        }
        return false;

    }
   
    public void solveSudoku(char[][] board) {
        SudokuSolver(board,0,0);  
        
    }
}