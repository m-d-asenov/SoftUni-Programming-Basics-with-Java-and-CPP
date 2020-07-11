import java.util.Scanner;

public class ChristmasTournament{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.nextLine());
		
		double totalMoney = 0.0;
		
		int winDays = 0;
		
		for(int i = 0; i < n; i++){
			
			int wins = 0;
			int losses = 0;
			
			double dayMoney = 0.0;
			
			String input = sc.nextLine();
			
			while(!input.equals("Finish")){
				
				String result = sc.nextLine();
			
				if(result.equals("win")){
					dayMoney += 20;
					wins++;
				}else{
					losses++;
				}
				
				//if(sc.hasNext()) 
				input = sc.nextLine();
			}
			
			if(wins > losses){
				dayMoney += dayMoney * 0.1;
				totalMoney += dayMoney;
				winDays++;
			}else{
				totalMoney += dayMoney;
			}
		}
		if(winDays > n - winDays){
			totalMoney += totalMoney * 0.2;
			System.out.printf("You won the tournament! Total raised money: %.2f", totalMoney);
		}else{
			System.out.printf("You lost the tournament! Total raised money: %.2f", totalMoney);
		}
	}
}