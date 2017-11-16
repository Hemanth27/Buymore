package page;

public class Amazon extends Variables{
	
	public void amazon_Breakeven()
	{
		double hsn_rate_value=hsn_rate+1;
		
       double break_even=((incoming_price+fixed +techno+weight_handling_charge+pick_pack_value)*hsn_rate_value)/(1-(((commission_rate+2)/100)*hsn_rate_value));
	  	
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
	  	
	  	
	  	   double purchase_order=((vendor_price/hsn_rate_value)*(1-(((commission_rate+2)/100)*hsn_rate_value)))-(weight_handling_charge+fixed+techno+pick_pack_value);
	  	
	  	   System.out.println(purchase_order);
	}
	
	public void amazon_orderCalculations()
	{
        display_price=principle_value+tax_value;
		
		System.out.println("Display Price : " + display_price);
		
		amazon_commission=(((commission_rate*(display_price/100))+fixed+techno+weight_handling_charge)*perc);
		System.out.println("Amazon commission rate :" + amazon_commission);
		
		
		buymore_commission=(((principle_value+tax_value)*2/100)+pick_pack_value)*perc;
		System.out.println("BuyMore Commission" +buymore_commission);
		
		order_tax=(tax_value-(commission_rate*(display_price/100)*0.18)-((weight_handling_charge*0.18)+(fixed+techno*0.18)+(pick_pack_value*0.18)+((display_price*0.02)*0.18)));
		System.out.println("Order Tax Value :"+ order_tax);
		
		payable_amount=display_price-(amazon_commission+buymore_commission)-order_tax;
		System.out.println("Payable amount :"+payable_amount);
	}
	
	public void amazon_payout()
	{
		amazon_commission=(((commission_rate*(display_price/100))+fixed+techno+weight_handling_charge));
		System.out.println("Amazon commission rate :" + amazon_commission);
		
		
		buymore_commission=(((display_price)*2/100)+pick_pack_value);
		System.out.println("BuyMore Commission" +buymore_commission);
		
		double amazon_payout= (display_price/(hsn_rate+1))-(buymore_commission+amazon_commission)+(incoming_price*hsn_rate);
		System.out.println(amazon_payout);
	}
	
	public void amazon_target_price()
	{
		
			double targetPrice= (Competitor_price *(1-(((commission_rate+2)/100)*hsn_rate)))-((fixed+techno+weight_handling_charge+pick_pack_value)*hsn_rate);
		  	System.out.println("Target Price" + targetPrice);
		  	
		  	double incoming_Price=(targetPrice/hsn_rate);
		  	System.out.println("New Incoming Price :" +incoming_Price);
		
	}
	
	
	

}
