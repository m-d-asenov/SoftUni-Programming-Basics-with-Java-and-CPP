import java.lang.Math;
import java.util.Scanner;

public class PoolDay 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

		int visitors = Integer.parseInt(sc.nextLine());
		double entranceFee = Double.parseDouble(sc.nextLine()); 
		double shezlongFee = Double.parseDouble(sc.nextLine());
		double umbrellaFee = Double.parseDouble(sc.nextLine());
		
		double totalFee = entranceFee * visitors + Math.ceil(visitors * 0.5) * umbrellaFee + Math.ceil(visitors * 0.75) * shezlongFee;
		
		System.out.printf("%.2f lv.", totalFee);
    }
}