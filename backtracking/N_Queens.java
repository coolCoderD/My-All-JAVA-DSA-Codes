public class N_Queens{


    static boolean isSafe(char board[][],int row,int col){
        //vertical up
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q') return false;
        }

        //diganol  left up
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q') return false;
        }

        //diagonal right up
        for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
            if(board[i][j]=='Q')  return false;
        }
        return true;
    }

    static void nQueens(char board[][],int row){

        if(row==board.length){
            printBoard(board);
            count++;
            return;

        }
        //column loop
        for(int j=0;j<board.length;j++){

            if(isSafe(board,row,j)){
                board[row][j]='Q';

            //function call
               nQueens(board,row+1); //call next row for next queen

            //backtracking 
                board[row][j]='x';

            }
        }


    }

    static int count=0;

    static void printBoard(char board[][]){
        System.out.println("----------------------------Chess Board-------------------");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }




    //Grid Ways

    public static int gridWays(int i,int j,int n,int m){
        
        //base Case
        if(i==n-1 || j==m-1) return 1; //doubt
        else if(i==n || j==n) return 0;

        int w1=gridWays(i+1, j, n, m);
        int w2=gridWays(i, j+1, n, m);
        return w1+w2;

    }



    
    
    public static void main(String args[]){
        int n=8;
        char board[][]=new char[n][n];

        //Initialize
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='x';
            }
        }
        nQueens(board,0);
        System.out.println(count);


        // int n=3,m=3;
        // System.out.println(gridWays(0, 0, n, m));
    }
}