import java.util.Scanner;

public class EnergyBooster{
	
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
	
		String fruit = sc.nextLine();
		String size = sc.nextLine();
		int quantity = Integer.parseInt(sc.nextLine());
	
		double price = 0.0;
	
		if ( "Watermelon".equals(fruit) ){
	
			if ( "big".equals(size) ){
			
				price = 28.7 * quantity * 5;
				if(price >= 400 && price <= 1000) price -= price * 0.15;
				if(price > 1000) price -= price * 0.5;
		
			} else {
			
				price = 56 * quantity * 2;
				if(price >= 400 && price <= 1000) price -= price * 0.15;
				if(price > 1000) price -= price * 0.5;
		
			}
	
		} else if ("Mango".equals(fruit)){
	
			if ("big".equals(size)){
			
				price = 19.6 * quantity * 5;
				if(price >= 400 && price <= 1000) price -= price * 0.15;
				if(price > 1000) price -= price * 0.5;
		
			} else {
			
				price = 36.66 * quantity * 2;
				if(price >= 400 && price <= 1000) price -= price * 0.15;
				if(price > 1000) price -= price * 0.5;
		
			}
	
		} else if ("Pineapple".equals(fruit)){
	
			if ("big".equals(size)){
			
				price = 24.8 * quantity * 5;
				if(price >= 400 && price <= 1000) price -= price * 0.15;
				if(price > 1000) price -= price * 0.5;
		
			} else {
			
				price = 42.1 * quantity * 2;
				if(price >= 400 && price <= 1000) price -= price * 0.15;
				if(price > 1000) price -= price * 0.5;
		
			}
	
		} else if ("Raspberry".equals(fruit)){
	
			if ("big".equals(size)){
			
				price = 15.2 * quantity * 5;
				if(price >= 400 && price <= 1000) price -= price * 0.15;
				if(price > 1000) price -= price * 0.5;
		
			} else {
			
				price = 20 *  quantity * 2;
				if(price >= 400 && price <= 1000) price -= price * 0.15;
				if(price > 1000) price -= price * 0.5;
		
			}
		}
	
		System.out.printf(" %.2f lv.", price);
	}
}