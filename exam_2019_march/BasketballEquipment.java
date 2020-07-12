import java.util.Scanner;

public class BasketballEquipment{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	
		double fee = Double.parseDouble(sc.nextLine());
		double sneakers = fee - fee * 0.4;
		double shorts = sneakers - sneakers * 0.2;
		double ball = shorts * 0.25;
		double accessories = ball * 0.2;
		double total = fee + sneakers + shorts + ball + accessories;
	
		System.out.printf("%.2f", total);	
	}	
}