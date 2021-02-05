public class ScoresDriver {
  public static void main(String[] args) {

    SuperArray scores = new SuperArray(5);

    scores.add(100);
    scores.add(90);
    scores.add(80);
    scores.add(90);
    scores.add(100);
    System.out.print("scores:");
    scores.display();
    scores.set(2,95);
    scores.display();
    scores.add(70);
    scores.display();
    scores.grow(2);
    scores.display();
    scores.remove(6);
    scores.display();
    scores.average();

  }//end of main
}//end of class
