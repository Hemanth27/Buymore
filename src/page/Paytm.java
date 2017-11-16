package page;

public class Paytm extends Variables {

	public void paytm_BreakEven()
	{
		double hsn_rate_value=hsn_rate+1;
       double break_even=((incoming_price+weight_handling_charge+pick_pack_value)*hsn_rate_value)/(1-(((commission_rate+2)/100)*hsn_rate_value));
	  	
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
	  	
	  	
	  	   double purchase_order=((vendor_price/hsn_rate_value)*(1-(((commission_rate+2)/100)*hsn_rate_value)))-(weight_handling_charge+pick_pack_value);
	  	
	  	   System.out.println(purchase_order);
	}
	
	public void paytm_deduction()
	{
		reverse_shipping= forward_shipping*1.25;
		collection_fee= 0.027*display_price;
		System.out.println(collection_fee);
		
		buymore_commission=(((principle_value+tax_value)*2/100)+pick_pack_value)*perc;
		System.out.println("BuyMore Commission" +buymore_commission);
		
		deduction= (forward_shipping+reverse_shipping+collection_fee)*perc + vendor_payment+Gst_payment+buymore_commission;
        System.out.println("Deduction :" +deduction);
	}
}
