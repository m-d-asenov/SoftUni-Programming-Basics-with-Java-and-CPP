import java.util.Scanner;

public class ChangeBureau 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

		int bitCoins = Integer.parseInt(sc.nextLine());
		double yuans = Double.parseDouble(sc.nextLine());
		double commiss = Double.parseDouble(sc.nextLine());
		
		double levs = bitCoins * 1168 + yuans * 0.15 * 1.76;
		double euros = levs / 1.95;
		double result = euros - ( euros * ( commiss / 100.0 ) );
		
		System.out.printf("%.2f", result);
    }
}