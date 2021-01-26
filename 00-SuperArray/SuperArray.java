import java.util.Arrays;
public class SuperArray {
  // instance variables
  private int[] arr;
  private int index;
  private int val;

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
    }

    temp[this.index] = val;
    this.index++;

    for (int i = 0;i < temp3.length;i++){
      temp[i + this.index] = temp3[i];
    }

    this.arr = temp;
  }//end of add
  public void add (int val) {
    for(int i = 0; i < arr.length;i++){
      if(this.arr[i] == 0){
        this.arr[i] = val;
        return;
      }
    }
    int[] temp = Arrays.copyOf(this.arr,this.arr.length + 1 );
    temp[temp.length-1] = val;
    this.arr = temp;
  }//end of add

  public void set (int index,int val) {
    this.arr[index] = val;
  }

  public void grow (int n) {
    int[] temp = Arrays.copyOf(this.arr,this.arr.length + n );
    this.arr = temp;
  }

  public boolean isEmpty () {
    for(int i = 0; i < arr.length;i++){
      if(this.arr[i] != 0){
        return false;
      }
    }
    return true;
  }

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
    this.arr = temp;
  }//end of remove

  public void display() {
    System.out.println(Arrays.toString(this.arr));
  }

  //public String toString() {}




  }//end toString method
