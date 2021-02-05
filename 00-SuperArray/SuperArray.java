import java.util.Arrays;
public class SuperArray {
  // instance variables
  private int[] arr;
  private int index;

  //------------------------------------------------//
  // constructor
  public SuperArray() {
    this.arr = new int[10];
    this.index = 0;

  }
  public SuperArray(int l) {
    this.arr = new int[l];
    this.index = 0;


  }//end constructor method
  //------------------------------------------------//
  public void add (int index,int val) {
    int[] temp = new int[this.arr.length+1];
    int[] temp2 = Arrays.copyOfRange(this.arr,0,index);
    int[] temp3 = Arrays.copyOfRange(this.arr,index, this.arr.length);

    for (int i = 0;i < temp2.length;i++){
      temp[i] = temp2[i];
      this.index++;
    }// end of method

    temp[this.index] = val;
    this.index++;

    for (int i = 0;i < temp3.length;i++){
      temp[i + this.index] = temp3[i];

    }
    this.index = 0;
    this.arr = temp;
  }//end of add

  public void add (int val) {
    for(int i = 0; i < arr.length;i++){
      if(this.arr[i] == 0){
        this.arr[i] = val;
        return;
      }// end of method
    }
    int[] temp = Arrays.copyOf(this.arr,this.arr.length + 1 );
    temp[temp.length-1] = val;
    this.arr = temp;
  }//end of add

  public void set (int index,int val) {
    this.arr[index] = val;
  }// end of method

  public void grow (int n) {
    int[] temp = Arrays.copyOf(this.arr,this.arr.length + n );
    this.arr = temp;
  }// end of method

  public boolean isEmpty () {
    for(int i = 0; i < arr.length;i++){
      if(this.arr[i] != 0){
        return false;
      }
    }
    return true;
  }// end of method

  public void remove (int index) {
    int[] temp = new int[this.arr.length-1];
    int[] temp2 = Arrays.copyOfRange(this.arr,0,index);
    int[] temp3 = Arrays.copyOfRange(this.arr,index+1, this.arr.length);

    for (int i = 0;i < temp2.length;i++){
      temp[i] = temp2[i];
      this.index++;
    }
    for (int i = 0;i < temp3.length;i++){
      temp[i + this.index] = temp3[i];
    }
    this.index = 0;
    this.arr = temp;
  }//end of remove

  public void average(){
    double sum = 0;
    for (int i = 0 ; i < this.arr.length;i++){
      sum = this.arr[i] + sum;
    }
      sum = sum / this.arr.length;
      System.out.println(sum);
  }

  public void display() {
    System.out.println(Arrays.toString(this.arr));
  }
//i personally like leaveing print inside of method so i use display mostly but i also did tostring
  public String toString() {
    return Arrays.toString(this.arr);
  }//end toString method

}//end of class
