import java.util.Scanner;

public class TrekkingMania{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	
		int groups = Integer.parseInt(sc.nextLine());
	
		int Mussala = 0;
		int Monblan = 0;
		int Killiman = 0;
		int K2 = 0;
		int Everest = 0;
		int total = 0;
		 
	
		for(int i = 0; i < groups; i++){
			int group = Integer.parseInt(sc.nextLine());
			
			total += group;
			 
			if(group <= 5) Mussala += group;
			else if( group > 5 && group <=12) Monblan += group;
			else if( group > 12 && group <=25) Killiman += group;
			else if( group > 25 && group <=40) K2 += group;
			else if( group > 40) Everest += group;
		}
		
		System.out.printf("%.2f", (Mussala * 100.0) / total);
		System.out.print("%");
		System.out.println();
		System.out.printf("%.2f", (Monblan * 100.0) / total);
		System.out.print("%");
		System.out.println();
		System.out.printf("%.2f", (Killiman * 100.00) / total);
		System.out.print("%");
		System.out.println();
		System.out.printf("%.2f", (K2 * 100.0) / total);
		System.out.print("%");
		System.out.println();
		System.out.printf("%.2f", (Everest * 100.0) / total);
		System.out.print("%");
	}
}