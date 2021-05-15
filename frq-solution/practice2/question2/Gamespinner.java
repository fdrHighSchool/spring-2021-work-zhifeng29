public class GameSpinner {
  private int num ;
  private int streak ;
  private int max ;


  public GameSpinner(int m){
    this.num = 0;
    this.streak = 0;
    this.max = m;
  }

  public int spin(){
    int temp = this.num;
    this.num = (int)(Math.random()*this.max)+1;
    if(this.num == temp){
      this.streak++;
    }
    else{
      this.streak = 1;
    }
    return this.num;
  }
  public int currentRun(){
    return this.streak;
  }
}
