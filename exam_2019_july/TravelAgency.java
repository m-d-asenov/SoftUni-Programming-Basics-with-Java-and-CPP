import java.util.Scanner;

public class TravelAgency 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

		String town = sc.nextLine();
		String extras = sc.nextLine();
		String vip = sc.nextLine();
		int days = Integer.parseInt(sc.nextLine());
		
		if(days < 1){
			System.out.println("Days must be positive number!");
			return;
		}
		
		if(days > 7) days --;
		
		double price = 0.0;
		
		if( town.equals("Bansko") || town.equals("Borovets") ){

			if(extras.equals("withEquipment")){
	
				price = 100 * days;
				if( vip.equals("yes")) price -= price*0.1;
				 
		
			}else if(extras.equals("noEquipment")){
	
				price = 80 * days;
				if( vip.equals("yes")) price -= price*0.05;
	
			}else{
				System.out.println("Invalid input!");
				return;
			}

		}else if(town.equals("Varna") || town.equals("Burgas")){

			if(extras.equals("withBreakfast")){
	
				price = 130 * days;
				if( vip.equals("yes")) price -= price*0.12;
	
			}else if(extras.equals("noBreakfast")){
	
				price = 100 * days;
				if( vip.equals("yes")) price -= price*0.07;
	
			}else{
	
				System.out.println("Invalid input!");
				return;
			}

		} else{

			System.out.println("Invalid input!");
			return;			
		}
		
		System.out.printf("The price is %.2flv! Have a nice time!", price);
    }
}