import java.util.Scanner;

public class FamilyTrip 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

		double budget = Double.parseDouble(sc.nextLine());
		int nights = Integer.parseInt(sc.nextLine());
		double pricePerNight = Double.parseDouble(sc.nextLine());
		int addExp = Integer.parseInt(sc.nextLine());
		
		double moneyNeeded = nights * pricePerNight + budget * (addExp / 100.0);
		
		if(nights > 7) moneyNeeded -= nights * pricePerNight * 0.05;
		
		if(moneyNeeded <= budget)
			System.out.printf("Ivanovi will be left with %.2f leva after vacation.", budget - moneyNeeded);
		else
			System.out.printf("%.2f leva needed.", moneyNeeded - budget);
    }
}