import java.util.Scanner;

public class Repainting 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

		int nylon = Integer.parseInt(sc.nextLine());
		int boya = Integer.parseInt(sc.nextLine()); 
		int razreditel = Integer.parseInt(sc.nextLine());
		int chasoveRabota = Integer.parseInt(sc.nextLine());
		
		double materialiRazhodi = (nylon + 2) * 1.5 + (boya + boya * 0.1) * 14.5 + razreditel * 5 + 0.4;
		double rabotniciRazhodi = materialiRazhodi * 0.3 * chasoveRabota;
		double total = materialiRazhodi + rabotniciRazhodi;
		
		System.out.printf("Total expenses: %.2f lv.", total);
    }
}