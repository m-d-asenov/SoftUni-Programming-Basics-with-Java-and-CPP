import java.util.Scanner;

public class PuppyCare{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		
		int food = Integer.parseInt(sc.nextLine());
		
		food *= 1000;
		
		String input = sc.nextLine();
		
		int eatenFood = 0;
		
		while( !input.equals("Adopted") ){
		
			int eaten = Integer.parseInt(input);
			
			eatenFood += eaten;
			
			input = sc.nextLine();	
		}
		
		if(food >= eatenFood){
			System.out.printf("Food is enough! Leftovers: %d grams.", food - eatenFood);
		}else{
			System.out.printf("Food is not enough. You need %d grams more." , eatenFood - food);
		}
	
	}
}