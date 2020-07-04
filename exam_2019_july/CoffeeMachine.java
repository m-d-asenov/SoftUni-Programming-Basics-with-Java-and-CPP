import java.util.Scanner;

public class CoffeeMachine 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

		String drink = sc.nextLine();
		String sugar = sc.nextLine();
		int quantity = Integer.parseInt(sc.nextLine());
		
		double price = 0.0;
		
		if( drink.equals("Espresso")){

			if(sugar.equals("Without")){
	
				price = 0.9 * quantity;
				price -= price * 0.35;
				if( quantity >= 5) price -= price*0.25;
				if(price > 15) price -= price * 0.2;
		
			}else if(sugar.equals("Normal")){
	
				price = 1.0 * quantity;
				if( quantity >= 5) price -= price*0.25;
				if(price > 15) price -= price * 0.2;
	
			}else if(sugar.equals("Extra")){
	
				price = 1.2 * quantity;
				if( quantity >= 5) price -= price*0.25;
				if(price > 15) price -= price * 0.2;
	
			}

		}else if(drink.equals("Cappuccino")){

			if(sugar.equals("Without")){
	
				price = 1.0 * quantity;
				price -= price * 0.35;
				if(price > 15) price -= price * 0.2;
	
			}else if(sugar.equals("Normal")){
	
				price = 1.2 * quantity;
				if(price > 15) price -= price * 0.2;
	
			}else if(sugar.equals("Extra")){
	
				price = 1.6 * quantity;
				if(price > 15) price -= price * 0.2;
			}

		} else if(drink.equals("Tea")){

			if(sugar.equals("Without")){
	
				price = 0.5 * quantity;
				price -= price * 0.35;
				if(price > 15) price -= price * 0.2;
	
			}else if(sugar.equals("Normal")){
	
				price = 0.6 * quantity;
				if(price > 15) price -= price * 0.2;
	
			}else if(sugar.equals("Extra")){
	
				price = 0.7 * quantity;
				if(price > 15) price -= price * 0.2;
			}
		}
		System.out.printf("You bought %d cups of %s for %.2f lv.", quantity, drink, price);
    }
}