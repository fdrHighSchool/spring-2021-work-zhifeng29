public class GameofLifeDriver{
  public static void main(String[] args) {
    GameofLife board1 = new GameofLife();
    GameofLife board2 = new GameofLife(15,15);
    //board2.printBoard();
    board2.setStatus(3,4);//(x,y)
    board2.randomBoard();
    board2.printBoard();
    board2.countNeighbors();
    board2.updateBoard();
    board2.printBoard();

    
  }

}
