public class PointDriver {
  public static void main(String[] args) {

    Point point1 = new Point();
    Point point2 = new Point(1,2);

    System.out.print(point1);
    System.out.println(point2);
    System.out.println(point2.distanceFromOrigin());
    System.out.println(point1.distance(5,5));
    System.out.println(point2.midpoint(6,2));
    System.out.println(point2.slope(6,2));
    System.out.println(point2.isCollinear(2,4,3,6));
  }//end of main
}//end of class
