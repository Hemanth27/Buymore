package pack;

import java.util.Scanner;

public class Amazon_Paytm {

	static double principle_value,tax_value,order_tax,incoming_price,commission_rate_paytm;
	static int pick_pack_value, techno;
	static double fixed;
	static double hsn_rate,display_price_paytm;
	//static float len,breadth,height,weight;
	static int weight_handling_charge,weight_handling_charge_paytm;
	static float commission_rate;
	static double display_price, payable_amount,buymore_commission,amazon_commission,paytm_commission;
	static double flipkart_commission,commission_rate_flipkart,display_price_flipkart,weight_handling_charge_flipkart;
	public static void main(String[] args) {
		Amazon_Paytm ap=new Amazon_Paytm();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Incoming Price");
		incoming_price=sc.nextDouble();
		
		System.out.println("Display Price for amazon");
		display_price=sc.nextDouble();
		
		System.out.println("Display Price for Paytm");
		display_price_paytm=sc.nextDouble();
		
		System.out.println("Display Price for Flipkart");
		display_price_flipkart=sc.nextDouble();
		
		System.out.println("HSN Rate value");
		hsn_rate=sc.nextDouble();
		
		
		System.out.println("Fixed Closed Fees");
		fixed=sc.nextInt();
		
		System.out.println("Technology fees");
		techno=sc.nextInt();
		
		
		System.out.println("Weight price");
		weight_handling_charge=sc.nextInt();
		
		System.out.println("Weight price for Paytm");
		weight_handling_charge_paytm=sc.nextInt();
		
		System.err.println("Weight Price for flipkart");
		weight_handling_charge_flipkart=sc.nextDouble();
		
		System.out.println("Pick Value");
		pick_pack_value=sc.nextInt();
		
		
		System.out.println("Commission Rate for Amazon");
		commission_rate=sc.nextFloat();
		
		System.out.println("Commission Rate for Paytm");
		commission_rate_paytm=sc.nextDouble();
		
		System.out.println("Commission Rate for Flipkart");
		commission_rate_flipkart=sc.nextDouble();
		
		ap.amazon_payout();
		
		System.out.println("**********");
		
		ap.paytm_pay();
		
		System.out.println("**********");
		
		ap.flipkart();
	}
	
	public void amazon_payout()
	{
		amazon_commission=(((commission_rate*(display_price/100))+fixed+techno+weight_handling_charge));
		System.out.println("Amazon commission rate :" + amazon_commission);
		
		
		buymore_commission=(((display_price)*2/100)+pick_pack_value);
		System.out.println("BuyMore Commission for Amazon :" +buymore_commission);
		
		double amazon_payout= (display_price/(hsn_rate+1))-(buymore_commission+amazon_commission)+(incoming_price*hsn_rate);
		System.out.println("Amazon Payout : " +amazon_payout);
	}
	
	public void paytm_pay()
	{
		
		paytm_commission=(((commission_rate_paytm*(display_price_paytm/100))+weight_handling_charge_paytm));
		System.out.println("Amazon commission rate for Paytm :" + paytm_commission);
		
		
		buymore_commission=(((display_price_paytm)*2/100)+pick_pack_value);
		System.out.println("BuyMore Commission for paytm :" +buymore_commission);
		
		double paytm_payout= (display_price_paytm/(hsn_rate+1))-(buymore_commission+paytm_commission)+(incoming_price*hsn_rate);
		System.out.println("Paytm Payout :" +paytm_payout);


	}
	
	public void flipkart()
	{
		
		if(display_price_flipkart<750)
		{
			fixed=fixed+15;
			flipkart_commission=(((commission_rate_flipkart*(display_price_flipkart/100))+weight_handling_charge_flipkart+fixed));
			System.out.println("Amazon commission rate for Flipkart :" + flipkart_commission);
			
			buymore_commission=(((display_price_flipkart)*2/100)+pick_pack_value);
			System.out.println("BuyMore Commission for Flipkart :" +buymore_commission);
			
			double flipkart_payout= (display_price_flipkart/(hsn_rate+1))-(buymore_commission+flipkart_commission)+(incoming_price*hsn_rate);
			System.out.println("Flipkart Payout :" +flipkart_payout);
		}
		else
		{
			fixed=fixed+((display_price_flipkart*2)/100);
			
			flipkart_commission=(((commission_rate_flipkart*(display_price_flipkart/100))+weight_handling_charge_flipkart+fixed));
			System.out.println("Amazon commission rate for Flipkart :" + flipkart_commission);
			
			buymore_commission=(((display_price_flipkart)*2/100)+pick_pack_value);
			System.out.println("BuyMore Commission for Flipkart :" +buymore_commission);
			
			double flipkart_payout= (display_price_flipkart/(hsn_rate+1))-(buymore_commission+flipkart_commission)+(incoming_price*hsn_rate);
			System.out.println("Flipkart Payout :" +flipkart_payout);
		}
		
		}
}
