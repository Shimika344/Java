import java.util.*;

//import javax.print.DocFlavor.STRING;
public class Tic_Tac_Toe {
    public static void main(String[] args){
            Scanner in = new Scanner(System.in);

            //Get the player's names 
            System.out.println("Player 1, What is your name ?");
            String p1 = in.nextLine();
            System.out.println("Player 2, What is your name? ");
            String p2 = in.nextLine();
        
            // 3 x 3 tic tac toe broad
            //-- empty space
            // X for player 1 
            // o player 2
            char[][] broad = new char[3][3];

            // fill the broad with - empty dashes
            for(int i = 0; i<3 ; i++){
                for(int j = 0 ; j<3 ; j++){
                    broad[i][j] = '-';
                }
            }
            
            //keep track of whose turn it is 
            boolean isPlayer1 = true ;

            //keep track id the game has ended
            boolean gameEnded =  false ;
            while(!gameEnded){

            // draw the broad 
            drawBoard(broad);

             
            //keep track of what symbol we are using to play
            char symbol = ' ';
            if(isPlayer1){
                symbol = 'x';
            }else{
                symbol = 'o';
            }
            // roww and col variable 
            if(isPlayer1){
                System.out.println(p1 + "s Turn(X):");
            }else{
                System.out.println(p1 + "s Turn(o):");
            }

            int row = 0 , col = 0 ;


            while(true){

            //get row and col from user
            System.out.println("Enter a row(0 , 1 ,or 2)");
             row = in.nextInt();
             System.out.println("Enter a col(0 , 1 ,or 2)");
             col = in.nextInt();

            // check if row and col are valid 
            if (row < 0 || col < 0 || row > 2 || col > 2 ) {
                System.out.println("your row and col are out of bounds ! ");
            }else if(broad[row][col] != '-'){
                //broad position has x or o
                System.out.println("Somebody has already made a move there !");
            }else{
                //row and col are valid 
                break ;

            }
        }
        //Setting the position on the player's symbol

        broad[row][col] = symbol;

        //check if a player has won
        if (hasWon(broad)=='x') {
            System.out.println(p1 +  " has won!");
            gameEnded = true ;
        }else if (hasWon(broad)=='o') {
            System.out.println(p2 + " has won!");
             gameEnded = true ;

        }else{
            // nobody won 
            if(hasTied(broad)){
                //tied
                System.out.println("it is tie !");
                gameEnded = true ;

            }else{
                //contiue game game and toggle the turn 
                isPlayer1 = !isPlayer1;
            }
        }
      }
       //print out the final state
       drawBoard(broad);
    }
    // printing out the broad 
    public static void drawBoard(char[][] board){
        for(int i = 0 ; i<3 ; i++){
            for(int j=0 ; j<3 ; j++){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
     
    public static char hasWon(char[][] board){
        //row 
        for(int i = 0 ; i< 3 ; i++){
         if(board[i][0] == board[i][1] && board[i][1] == board[i][2] && 
        board[i][0] != '-'){
            return board[i][0];
         }
       }

       //col
       for(int j = 0 ; j<3 ; j++){
        if(board[0][j] == board[1][j] && board[1][j]==board[2][j] && board[0][j] != '-'){
            return board[0][j];
        }
       }

       //diagonal 
       if(board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != '-'){
        return board[0][0];
       }
       if (board[2][0]== board[1][1] && board[1][1]==board[0][2] && board[2][0] != '-') {
        return board[2][0];
       }

       //nobody has won
       return '-';
    }
    // check if the board is full 
    public static boolean hasTied(char[][]  board){
        for(int i = 0 ; i< 3 ; i++){
            for(int j = 0 ; j <3 ; j++ ){
                if(board[i][j]=='-'){
                    return false;
                }
            }
        }
        return true;
    }
}
