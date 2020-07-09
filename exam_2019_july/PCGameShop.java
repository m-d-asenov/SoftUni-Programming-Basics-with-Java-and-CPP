import java.util.Scanner;

public class PCGameShop{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		
		double sales = Double.parseDouble(sc.nextLine());
		
		int hearthstone = 0;
		int fornite = 0;
		int overwatch = 0;
		int others = 0;
		
		for(int i = 0; i < sales; i++){
			
			String game = sc.nextLine();
				
			if(game.equals("Hearthstone")){
				hearthstone++;
			}else if(game.equals("Fornite")){
				fornite++;
			}else if(game.equals("Overwatch")){
				overwatch++;
			}else{
				others++;
			}
		}
		
		System.out.printf("Hearthstone - %.2f%%%n", hearthstone * 100 / sales);
		System.out.printf("Fornite - %.2f%%%n", fornite * 100 / sales);
		System.out.printf("Overwatch - %.2f%%%n", overwatch * 100 / sales);
		System.out.printf("Others - %.2f%%%n", others * 100 / sales);
	}
}