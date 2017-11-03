package pack;

import java.util.Scanner;

public class Deduction {

	//Total deduction = (Forward shipping + reverse shipping + collection fee) *1.18 + vendor payment amount +net  GST payable + Net Buymore commission
	// forward = weight handling charges
	static double deduction,forward_shipping;
	static double reverse_shipping;
	static double collection_fee;
	final static double perc=1.18;
	static double principle_value,tax_value;
	static int pick_pack_value;
    static double display_price;
	static double vendor_payment, Gst_payment,buymore_commission;
	static int i;
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Prinicpal ");
			principle_value=sc.nextDouble();
			
			System.out.println("Tax Value");
			tax_value=sc.nextDouble();
			
			System.out.println("Pick Pack");
			pick_pack_value=sc.nextInt();
			
			display_price=principle_value+tax_value;
			
			System.out.println("Forward =Weight handling");
			forward_shipping=sc.nextDouble();
			
			System.out.println("Reverse Shipping");
			reverse_shipping=sc.nextDouble();
			
			System.out.println("Colelction fee");
			collection_fee=sc.nextDouble();
			
			System.out.println("Vendor Payment");
			vendor_payment=sc.nextDouble();
			
			System.out.println("GST Payment");
			Gst_payment=sc.nextDouble();
			
			buymore_commission=(((principle_value+tax_value)*2/100)+pick_pack_value)*perc;
			System.out.println("BuyMore Commission" +buymore_commission);
			
			
				/*collection_fee= ((2/100)*display_price);
				System.out.println(collection_fee);*/
				deduction= (forward_shipping+reverse_shipping+collection_fee)*perc + vendor_payment+Gst_payment+buymore_commission;
			
			
			System.out.println(deduction);
			
			
			
			
		
		
		
/*Reverse shipping in case of Paytm  = Forward shipping * 1.25 
 Reverse shipping in case of flipkart = calculate as table , corresponding values shown below 

Forward        Reverse 
45.                55
25.                30
65.                80
30                35 

Collection fee 
2.7 pc in case of Paytm , 

Flipkart 
15 till 750 
Then 2pc
*/
	}
	
	
}
