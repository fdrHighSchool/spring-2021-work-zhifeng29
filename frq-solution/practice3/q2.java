public class CombineTable extends singleTable{
  private int seats;
  private double quality;
  private int height;

  public CombineTable(){
    
  }
  public boolean canSeat(int seat){
    if (t1.getNumSeats()+t2.getNumSeats()-2 <= seat){
      return true;
    }
    return false;
  }
  public double getDesirability(){
    if (t1.getHeight() == t2.getHeight()){
      return (t1.getViewQuality() + t2.getViewQuality())/2;
    }
    else{
    return (t1.getViewQuality() + t2.getViewQuality())/2-10;
    }
  }
}
