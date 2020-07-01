import java.util.Scanner;

public class SchoolSupplies 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

		int pens = Integer.parseInt(sc.nextLine());
		int markers = Integer.parseInt(sc.nextLine());
		double cleaner = Double.parseDouble(sc.nextLine());
		int reduction = Integer.parseInt(sc.nextLine());
		
		double pensPrice = pens * 5.8;
		double markersPrice = markers * 7.2;
		double cleanerPrice = cleaner * 1.2;
		double totalPrice = pensPrice + markersPrice + cleanerPrice;
		totalPrice -= totalPrice * reduction / 100;
		
		System.out.printf("%.3f", totalPrice);
    }
}