public class N_Queens {

    //Question is how many ways that queen be set in chessboard so that no two queens attack each other so print all solutions
    public static boolean isSafe(char board[][],int row,int col){
        //ok like agar me queen bhitha rah hu to me upar check karuga ki is it fighting with each other or not

        //vertical up
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){ //isme to coloum same rahega logic=> (row is decreasing and coloum same)
                return false;      //so false
            }
        }

        //diag left
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){ //isme (row bhi decreasing and coloun also decreasing )
            if(board[i][j]=='Q'){
                return false;
            }



        }

        //diag right
        for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }

        }
        return true;
    }

    public static void Queens(char board[][],int row){ //like from which row we have to start
        //base case
        if(row==board.length){
            printBoard(board);
            return;
        }
        //recursion
        //for coloums loop
        for(int j=0;j<board.length;j++){
            if(isSafe(board,row,j)){
                 board[row][j]='Q';
                 Queens(board, row+1);
                 board[row][j]='x';//this is important because this process is Backtracking
                 //ok now here pehele to haar ek row par queen bhaith jayegi kyuki row badhete jayega to board[row][j]="Q" wala hote jayega 
                //baad me aayega backtracking wala step usme usme jaha pe bhi queen rakhi he usko 'x' banakar j++ karke wala par ek aur baar 
                //board[row][j]="Q" statement run hojayega phir recursion pe mat jana kyuki it's already return and memory got erase of that thing

            }
           
        }    

    }
    public static void printBoard(char board[][]){
        System.out.println("===============Chess Board==============");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int n=4;
        char [][]board=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='x';
            }
        }
        Queens(board, 0);//konsi row se cahlu karna he
        //can count the number of ways
    }
    

    
}
