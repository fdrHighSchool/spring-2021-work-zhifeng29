public class SuperArrayDriver {
  public static void main(String[] args) {
    SuperArray array = new SuperArray();
    SuperArray array2 = new SuperArray(5);
    array.display();
    for (int i = 0;i < 10;i++){
      array.set(i,i);
    }

    System.out.println(array.isEmpty());
    array.grow(2);
    array.display();
    array.remove(4);
    array.display();
    for (int i = 0;i < 5;i++){
      array.add(78);
    }
    array.display();
    System.out.println("here");

    for (int i = 0;i < 5;i++){
      array2.set(i,i);
    }
    array2.add(1,100);
    array2.display();
  }//end of main
}//end of class
