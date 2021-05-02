import java.util.*;

public class main{

	public static void main(String[] args) {
		String[] name = {"bread","milk","ice cream","apples","bacon"};
		Double[] price = {3.25,2.50,4.50,1.35,4.99};
		Double[] discount = {1.5,0.25,0.5};
		double total = 0;
		System.out.println("Order Items:");
		display(name[0],price[0]);
		display(name[1],price[1]);
		display(name[2],price[2],discount[0]);
		display(name[3],price[3],discount[1]);
		display(name[4],price[4],discount[2]);
		for(int i = 0; i <price.length;i++){
			total = total + price[i];
		}
		System.out.println("Sub-total: $"+total);
		System.out.println("Items Discounted: "+discount.length);
	}//end main method

	public static void display(String n, double p){
		System.out.println(n+" $"+ p );


	}

	public static void display(String n, double p,double d){
		System.out.println(n+" $"+ p+"(-$"+d+")" );


	}

}//end class
