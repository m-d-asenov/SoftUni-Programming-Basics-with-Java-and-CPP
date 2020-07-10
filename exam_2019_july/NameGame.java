import java.util.Scanner;

public class NameGame{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		
		int maxPoints = 0;
		
		String winner = "";
		
		while( !input.equals("Stop") ){
			
			int n = input.length();
			
			int points = 0;
			
			for(int i = 0; i < n; i++){
				int num = Integer.parseInt(sc.nextLine());
				
				if( num == input.charAt(i) ){
					points += 10;
				}else{
					points += 2;
				}
			}
			
			if(points >= maxPoints){
				maxPoints = points;
				winner = input;
			}
			
			if(sc.hasNext()) input = sc.nextLine();
		}
		
		System.out.println("The winner is " + winner + " with " + maxPoints + " points!");
	}
}