import java.util.Arrays;
import java.lang.Math;
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

 public double distance(int dx,int dy) {
   if(x==0){
     this.x=1;
   }
   if(y==0){
     this.y=1;
   }
   if(dx==0){
     dx=1;
   }
   if(dy==0){
     dy=1;
   }
   return Math.sqrt(Math.abs(this.x * this.x * dx * dx) + Math.abs(this.y * this.y * dy * dy));
 }

 public String midpoint(double x2,double y2) {
   x2 = (x2 + x)/2;
   y2 = (y2 + y)/2;

   return "(" + x2 + ", " + y2 + ")";
 }
 public String slope(int x2,int y2) {
   y2=y2-(y);
   x2=x2-(x);

   return   x2 + "/" + y2  ;
 }
 public boolean isCollinear(int x2,int y2,int x3,int y3){
   if (x == 0 && x2 == 0 && x3 == 0){
     return true;
   }
   if (y == 0 && y2 == 0 && y3 == 0){
     return true;
   }
   if(x/y == x2/y2 && x/y == x3/y3){
     return true;
   }
   return false;
 }
}//end of class
