import java.util.Scanner;

public class Shopping 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

		double budget = Double.parseDouble(sc.nextLine());
		double video = Integer.parseInt(sc.nextLine());
		double processor = Integer.parseInt(sc.nextLine());
		double ram = Integer.parseInt(sc.nextLine());
		
		double videoMoney = 250 * video;
		double processorMoney = videoMoney * 0.35 * processor;
		double ramMoney = videoMoney * 0.1 * ram;
		
		double total = videoMoney + processorMoney + ramMoney;
	
		if(video > processor) total -= total * 0.15;
		
		if(budget >= total)
			System.out.printf("You have %.2f leva left!", budget - total);
		else
			System.out.printf("Not enough money! You need %.2f leva more!", total - budget);
    }
}