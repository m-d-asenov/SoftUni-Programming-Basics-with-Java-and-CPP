import java.lang.Math;
import java.util.Scanner;

public class PetsFood{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	
		int days = Integer.parseInt(sc.nextLine());
		double totalFood = Double.parseDouble(sc.nextLine());
	
		double dogFood = 0.0;
		double catFood = 0.0;
		double biscuits = 0.0;
	
		for(int i = 1; i <= days; i++){
			int dogDailyFood = Integer.parseInt(sc.nextLine());
			int catDailyFood = Integer.parseInt(sc.nextLine());
		
			dogFood += dogDailyFood;
			catFood += catDailyFood;
		
			if(i%3 == 0){
				biscuits += (dogDailyFood + catDailyFood) * 0.1;
			}
		}
	
		double eatenFood = dogFood + catFood;
	
		double eatenFoodPercentage = (eatenFood * 100) / totalFood;
		double dogFoodPercentage = (dogFood * 100) / eatenFood;
		double catFoodPercentage = (catFood * 100) / eatenFood;
		biscuits = Math.round(biscuits);
	
		System.out.printf("Total eaten biscuits: %.0fgr.%n", biscuits);
		System.out.printf("%.2f%% of the food has been eaten.%n", eatenFoodPercentage);
		System.out.printf("%.2f%% eaten from the dog.%n",dogFoodPercentage);
		System.out.printf("%.2f%% eaten from the cat.%n",catFoodPercentage);
	}
}