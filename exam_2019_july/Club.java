import java.util.Scanner;

public class Club{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	
		double targetProfit = Double.parseDouble(sc.nextLine());
		double realProfit = 0.0;
		
		String input = sc.nextLine();
		
		while( !input.equals("Party!") ){
		
			int cocktailPrice = input.length();
			int cocktailNumber = Integer.parseInt(sc.nextLine());
			
			double totalPrice = cocktailPrice * cocktailNumber;
			
			if(totalPrice % 2 == 1) totalPrice -= totalPrice * 0.25;

			realProfit += totalPrice;
			
			if(realProfit >= targetProfit) break;
			
			if(sc.hasNext()){
				input = sc.nextLine();
			}	
		}
		
		if(realProfit < targetProfit){
			System.out.printf("We need %.2f leva more.%n",  targetProfit - realProfit);
			System.out.printf("Club income - %.2f leva.",  realProfit);	
		}else{
			System.out.println("Target acquired.");
			System.out.printf("Club income - %.2f leva.",  realProfit);
		}
	}
}