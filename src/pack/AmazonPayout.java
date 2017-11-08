package pack;

import java.util.Scanner;

public class AmazonPayout {
       
		static double principle_value,tax_value,order_tax,incoming_price;
		static int pick_pack_value, fixed_techno;
		static double hsn_rate;
		//static float len,breadth,height,weight;
		static int weight_handling_charge;
		static float commission_rate;
		static double display_price, payable_amount,buymore_commission,amazon_commission;

		public static void main(String[] args) {
			
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Incoming Price");
			incoming_price=sc.nextDouble();
			
			System.out.println("Display Price");
			display_price=sc.nextDouble();
			
			/*System.out.println("Tax Value");
			tax_value=sc.nextDouble();*/
			
			System.out.println("HSN Rate value");
			hsn_rate=sc.nextDouble();
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
			
			//display_price=principle_value+tax_value;
			
			//System.out.println("Display Price : " + display_price);
			
			amazon_commission=(((commission_rate*(display_price/100))+fixed_techno+weight_handling_charge));
			System.out.println("Amazon commission rate :" + amazon_commission);
			
			
			buymore_commission=(((display_price)*2/100)+pick_pack_value);
			System.out.println("BuyMore Commission" +buymore_commission);
			
			double amazon_payout= (display_price/(hsn_rate+1))-(buymore_commission+amazon_commission)+(incoming_price*hsn_rate);
			System.out.println(amazon_payout);
		}
		
		
	}


