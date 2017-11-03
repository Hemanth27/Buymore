package pack;

import java.util.Scanner;

public class Order_Calculation {

	final static double perc=1.18;
	static double principle_value,tax_value,order_tax;
	static int pick_pack_value, fixed_techno;
	//static float hsn_rate;
	//static float len,breadth,height,weight;
	static int weight_handling_charge;
	static float commission_rate;
	static double display_price, payable_amount,buymore_commission,amazon_commission;

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Principal Value");
		principle_value=sc.nextDouble();
		
		System.out.println("Tax Value");
		tax_value=sc.nextDouble();
		
		
		/*System.out.println("Order Tax Value");
		order_tax=sc.nextDouble();*/
		
		System.out.println("Fixed Close and Technology");
		fixed_techno=sc.nextInt();
		
		System.out.println("Weight price");
		weight_handling_charge=sc.nextInt();
		
		System.out.println("Pick Value");
		pick_pack_value=sc.nextInt();
		
		
		System.out.println("Commission Rate");
		commission_rate=sc.nextFloat();
		
		display_price=principle_value+tax_value;
		
		System.out.println("Display Price : " + display_price);
		
		amazon_commission=(((commission_rate*(display_price/100))+fixed_techno+weight_handling_charge)*perc);
		System.out.println("Amazon commission rate :" + amazon_commission);
		
		
		buymore_commission=(((principle_value+tax_value)*2/100)+pick_pack_value)*perc;
		System.out.println("BuyMore Commission" +buymore_commission);
		
		order_tax=(tax_value-(commission_rate*(display_price/100)*0.18)-((weight_handling_charge*0.18)+(fixed_techno*0.18)+(pick_pack_value*0.18)+((display_price*0.02)*0.18)));
		System.out.println("Order Tax Value :"+ order_tax);
		
		payable_amount=display_price-(amazon_commission+buymore_commission)-order_tax;
		System.out.println("Payable amount :"+payable_amount);
			
		
	}
}
