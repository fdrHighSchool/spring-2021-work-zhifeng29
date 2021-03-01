import java.util.Arrays;
public class Point {
  // instance variables
  private int x;
  private int y;
  //------------------------------------------------//
  // constructor
  public Point(){
    this(0,0);
  }
  public Point(int x,int y){
    setLocation(x,y);
  }

  //end constructor method
  //------------------------------------------------//
 public double distanceFromOrigin() {
   return Math.sqrt(x * x + y * y);
 }

 // returns the x-coordinate of this point
 public int getX() {
   return x;
 }

 // returns the y-coordinate of this point
 public int getY() {
   return y;
 }

 // sets this point's (x, y) location to the given values
 public void setLocation(int x, int y) {
   this.x = x;
   this.y = y;
 }

 // returns a String representation of this point
 public String toString() {
   return "(" + x + ", " + y + ")";
 }

 // shifts this point's location by the given amount
 public void translate(int dx, int dy) {
   setLocation(x + dx, y + dy);
 }
}//end of class
