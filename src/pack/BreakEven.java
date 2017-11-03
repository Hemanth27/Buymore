package pack;

import java.util.Scanner;

public class BreakEven {
 
	static double incoming_price;
	static int min_per,max_per,pick_pack_value, fixed_techno;
	static float hsn_rate;
	//static float len,breadth,height,weight;
	static float weight_handling_charge;
	static float commission_rate;
	static double vendor_price,min_rate,max_rate;

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Incoming Price");
		incoming_price=sc.nextDouble();
		
		System.out.println("Fixed Close and Technology");
		fixed_techno=sc.nextInt();
		
		System.out.println("Weight price");
		weight_handling_charge=sc.nextFloat();
		
		System.out.println("Pick Value");
		pick_pack_value=sc.nextInt();
		
		System.out.println("HSN RATE");
		hsn_rate=sc.nextFloat();
	
		System.out.println("Commission Rate");
		commission_rate=sc.nextFloat();
		
		System.out.println("Min Percenatge");
		min_per=sc.nextInt();
		
		System.out.println("Max Percenatge");
		max_per=sc.nextInt();
		
		float hsn_rate_value=(hsn_rate+1);
		System.out.println(hsn_rate_value);
		
		System.out.println("Vendor Price");
		vendor_price=sc.nextDouble();
		
		
	  	double break_even=((incoming_price+fixed_techno+weight_handling_charge+pick_pack_value)*hsn_rate_value)/(1-(((commission_rate+2)/100)*hsn_rate_value));
	  	
	  	System.out.println("Break Even Selling Price" +break_even);
	  	
	  	if(min_per<0)
	  	{
	  		min_rate=(break_even+((break_even*min_per)/100));
		  	System.out.println("Minimun Selling Price" +min_rate);
	  	}
	  	else
	  	{
	  	   min_rate=(((break_even*min_per)/100)+break_even);
	  	  System.out.println("Minimun Selling Price" +min_rate);
	  	}
	  	
	  	   max_rate=(((break_even*max_per)/100)+break_even);
	  	   System.out.println("Maximun Selling Price" +max_rate);
	  	
	  	
	  	   double purchase_order=((vendor_price/hsn_rate_value)*(1-(((commission_rate+2)/100)*hsn_rate_value)))-(weight_handling_charge+fixed_techno+pick_pack_value);
	  	
	  	   System.out.println(purchase_order);
	  	
	}
	
}
