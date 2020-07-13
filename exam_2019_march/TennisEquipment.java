import java.lang.Math;
import java.util.Scanner;

public class TennisEquipment{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		double racketPrice = Double.parseDouble(sc.nextLine());
		int rackets = Integer.parseInt(sc.nextLine());
		int sneakers = Integer.parseInt(sc.nextLine());
		
		double sneakersPrice = racketPrice / 6.0;
		
		double racketsSneakersPrice = racketPrice * rackets + sneakersPrice * sneakers;
		
		double totalPrice = racketsSneakersPrice + racketsSneakersPrice * 0.2;
		
		int Djokovich = (int)Math.floor(totalPrice / 8.0);
		int sponsors =  (int)Math.ceil((7 * totalPrice) / 8.0);
		
		System.out.println("Price to be paid by Djokovic " + Djokovich);
		System.out.println("Price to be paid by sponsors " + sponsors);
	}
}