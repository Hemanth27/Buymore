package pack;

import java.util.Scanner;

public class TargetPriceUpdate {
	static double principle_value,tax_value,order_tax,Competitor_price,vendor_price;
	static int pick_pack_value;
	static double fixed_techno;
	static double hsn_rate;
	//static float len,breadth,height,weight;
	static float weight_handling_charge;
	static float commission_rate;
	static double display_price, payable_amount,buymore_commission,amazon_commission,paytm_commission;
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Competitor Price");
		Competitor_price=sc.nextDouble();
		
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
		
		
		/*System.out.println("Vendor Price");
		vendor_price=sc.nextDouble();*/
		
		
	    double targetPrice= (Competitor_price *(1-(((commission_rate+2)/100)*hsn_rate)))-((fixed_techno+weight_handling_charge+pick_pack_value)*hsn_rate);
	  	System.out.println("Target Price" + targetPrice);
	  	
	  	double incoming_Price=(targetPrice/hsn_rate);
	  	System.out.println("New Incoming Price :" +incoming_Price);
	  	
	  	}
	}
