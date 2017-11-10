package pack;

import java.util.Scanner;

public class UpdateIncomingPrice {
	static double incoming_price;
	static int min_per,max_per,pick_pack_value, fixed_techno;
	static float hsn_rate,hsn_rate_value;
	//static float len,breadth,height,weight;
	static float weight_handling_charge;
	static double commission_rate,displayprice,amazon_Com;
	static double vendor_price,min_rate,max_rate,compitator_price,vendor_incoming_price,new_incoming_price;

	
	public static void main(String[] args) {
		hsn_rate=(float) 0.28;
		hsn_rate_value=1+hsn_rate;
		vendor_incoming_price=4500;
		new_incoming_price=vendor_incoming_price/hsn_rate_value;
		incoming_price=3033.32;
		fixed_techno=50;
		min_per=0;
		max_per=10;
		
		commission_rate=11.5;
		pick_pack_value=10;
		weight_handling_charge=50;
		compitator_price=5494;
		displayprice=5350.33;
		
		
		
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
	  	   
	  	   System.out.println("**********************************");
	  	
	  	  UpdateIncomingPrice up= new UpdateIncomingPrice();
	  	  up.amazonPayout_compitetor();
	  	  
	  	   System.out.println("**********************************");
	  	   
	      double vendor_incoming=incoming_price*hsn_rate_value;
	      System.out.println("Vendor side Incoming Price" + vendor_incoming);
	      
	      System.out.println("**********************************");
	      
	      up.newIncomingPrice();
	      
	      double newvendor_incoming=vendor_incoming_price/hsn_rate_value;
	      System.out.println("Vendor side Incoming Price" + vendor_incoming);
	      
}
	
	
	public void amazonPayout_compitetor()
	{
		double amazon_commission=(((commission_rate*(compitator_price/100))+fixed_techno+weight_handling_charge));
		System.out.println("Amazon commission rate :" + amazon_commission);
		
		
		double buymore_commission=(((compitator_price)*2/100)+pick_pack_value);
		System.out.println("BuyMore Commission for Amazon :" +buymore_commission);
		
		double amazon_payout= (compitator_price/(hsn_rate+1))-(buymore_commission+amazon_commission)+(incoming_price*hsn_rate);
		System.out.println("Amazon Payout Target Price in Vendor : " +amazon_payout);
	}
	
	
	public void newIncomingPrice()
	{
		double vendor_incoming_price1=vendor_incoming_price/hsn_rate_value;
		System.out.println(vendor_incoming_price1);
		
       double break_even1=((vendor_incoming_price1+fixed_techno+weight_handling_charge+pick_pack_value)*hsn_rate_value)/(1-(((commission_rate+2)/100)*hsn_rate_value));
	  	
	  	System.out.println("Break Even Selling Price 1 :" + break_even1);
	  
	  	if(min_per<0)
	  	{
	  		min_rate=(break_even1+((break_even1*min_per)/100));
		  	System.out.println("Minimun Selling Price" +min_rate);
	  	}
	  	else
	  	{
	  	   min_rate=(((break_even1*min_per)/100)+break_even1);
	  	  System.out.println("Minimun Selling Price" +min_rate);
	  	}
	  	
	  	   max_rate=(((break_even1*max_per)/100)+break_even1);
	  	   System.out.println("Maximun Selling Price" +max_rate);
	}
}
