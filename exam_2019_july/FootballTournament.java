import java.util.Scanner;

public class FootballTournament{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		
		String team = sc.nextLine();
		
		int matches = Integer.parseInt(sc.nextLine());
		
		if(matches == 0){
			System.out.println(team + " hasn't played any games during this season.");
			return;
		}
		
		int wins = 0;
		int losses = 0;
		int draws = 0;
		
		for(int i = 0; i < matches; i++){
			
			String result = sc.nextLine();
			
			if(result.equals("W")) wins += 3;
			else if (result.equals("D")) draws++;
			else losses++;	
		}
		
		System.out.printf("%s has won %d points during this season.%n",team, wins + draws);
		System.out.println("Total stats:");
		System.out.printf( "## W: %d%n", wins/3);
		System.out.printf( "## D: %d%n", draws);
		System.out.printf( "## L: %d%n", losses);
		System.out.printf("Win rate: %.2f", (wins/3) * 100 / (double)matches); 
		System.out.print("%");
	
	}
}