import java.util.*;
public class GameofLife{
  //instance variables
  private int[][] board;
  private int[][] neighbor;

  //constructer
  public GameofLife(){
    this.board = new int [10][10];
    this.neighbor = new int [10][10];
  }
  public GameofLife(int column,int row){
    this.board = new int [column][row];
    this.neighbor = new int [column][row];
  }

  //

  public void printBoard( ){
    for (int i = 0; i < this.board.length;i++){
      System.out.println(Arrays.toString(this.board[i]));
    }
    System.out.println(" ");
  }

  public void printNeighbor( ){
    for (int i = 0; i < this.neighbor.length;i++){
      System.out.println(Arrays.toString(this.neighbor[i]));
    }
    System.out.println(" ");
  }

  public void updateBoard(){
    countNeighbors();
    for (int c = 0; c < this.board.length; c++) {
      for (int r = 0; r < this.board[c].length; r++) {
        if (this.neighbor[c][r] < 2 || this.neighbor[c][r] > 3 ){
          this.board[c][r] = 0;
        }
        else if(this.neighbor[c][r] == 3){
          this.board[c][r] = 1;
        }

      }
    }
    for (int c = 0; c < this.board.length; c++) {
      for (int r = 0; r < this.board[c].length; r++) {
          this.neighbor[c][r] = 0;
      }
    }
  }
  public void countNeighbors(){
    for (int c = 0; c < this.board.length; c++) {
      for (int r = 0; r < this.board[c].length; r++) {
        for (int i = -1; i < 2; i++){
          for(int j = -1; j < 2; j++){
            try{
              if(this.board[c+i][r+j] == 1 ){
                this.neighbor[c][r]++;
              }

            }
            catch(ArrayIndexOutOfBoundsException e){
              //this is here so it won't give out of bound error
              //System.out.println("something when wrong");
            }
          }
        }
        if( this.board[c][r] == 1){
          this.neighbor[c][r]--;
        }
      }
    }




  }//end of countNeighbors
  public void setStatus (int x,int y){
    if (this.board[y-1][x-1] == 0){
      this.board[y-1][x-1] = 1;
    }
    else {
      this.board[y-1][x-1] = 0;
    }
  }

  public void randomBoard(){
    for (int i = 0; i < this.board.length; i++) {
        for (int j = 0; j < this.board[i].length; j++) {
          this.board[i][j] = (int) (Math.random() * (2) );
        }
    }
  }
}
