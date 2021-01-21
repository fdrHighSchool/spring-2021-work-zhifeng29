public class SuperArray {
  // instance variables
  private int[] arr;

  //------------------------------------------------//
  // constructor
  public SuperArray() {
    this.arr = new int[10];
  }
  public SuperArray(int l) {
    this.arr = new int[l];
  }//end constructor method
  //------------------------------------------------//
  public String getName() {
    return this.name;
  }//end getName method

  public int getCurrentage() {
    return this.currentage;
  }//end getAgelimit method

  public int getAgelimit() {
    return this.agelimit;
  }//end getAgelimit method
  public double percent() {
    double ans = (double)this.currentage/(double)this.agelimit;
    return ans;
  }//end getAgelimit method

  public String toString() {
    return "Name: " + this.name + " CurrentAge: " + this.currentage + " Agelimit: " + this.agelimit;

  }//end toString method
