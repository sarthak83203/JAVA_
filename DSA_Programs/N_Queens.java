public class N_Queens {

    public static void Queens(char board[][],int row){ //like from which row we have to start

        //base case
        if(row==board.length){
            printBoard(board);
            return;
        }

        //recursion
        //for coloums loop
        for(int j=0;j<board.length;j++){
            board[row][j]='Q';
            Queens(board, row+1);
            board[row][j]='.';//this is important because this process is Backtracking
            //ok now here pehele to haar ek row par queen bhaith jayegi kyuki row badhete jayega to board[row][j]="Q" wala hote jayega 
            //baad me aayega backtracking wala step usme usme jaha pe bhi queen rakhi he usko '.' banakar j++ karke wala par ek aur baar 
            //board[row][j]="Q" statement run hojayega phir recursion pe mat jana kyuki it's already return and memory got erase of that thing
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
        int n=2;
        char [][]board=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        Queens(board, 0);//konsi row se cahlu karna he
    }
    

    
}
