import java.util.Scanner;

public class SuitcasesLoad{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		
		double space = Double.parseDouble(sc.nextLine());
		
		int suitcases = 0;
		
		String input = sc.nextLine();
		
		while(!input.equals("End")){
				double suitcase = Double.parseDouble(input);
				
				if((suitcases + 1) % 3 == 0){
					
						suitcase += suitcase * 0.1;
				}
				
				if(space - suitcase < 0){
					System.out.println("No more space!");
					System.out.println("Statistic: " + suitcases + " suitcases loaded.");
					return;
				}
				space -= suitcase;
				suitcases++;
				
				if(sc.hasNext()) input = sc.nextLine();
		}
		System.out.println("Congratulations! All suitcases are loaded!");
		System.out.println("Statistic: " + suitcases + " suitcases loaded.");
	}
}