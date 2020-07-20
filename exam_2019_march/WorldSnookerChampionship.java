import java.util.Scanner;

public class WorldSnookerChampionship{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		String round = sc.nextLine();
		String ticket = sc.nextLine();
		int numberTickets = Integer.parseInt(sc.nextLine());
		char tropheyPic = sc.nextLine().charAt(0);

		double ticketsPrice = 0.0;
		
		if(round.equals("Quarter final")){
			if(ticket.equals("Standard")){
				ticketsPrice = numberTickets * 55.50;
			}else if(ticket.equals("Premium")){
				ticketsPrice = numberTickets * 105.20;
			}else{
				ticketsPrice = numberTickets * 118.90;
			}
		}else if(round.equals("Semi final")){
			if(ticket.equals("Standard")){
				ticketsPrice = numberTickets * 75.88;
			}else if(ticket.equals("Premium")){
				ticketsPrice = numberTickets * 125.22;
			}else{
				ticketsPrice = numberTickets * 300.40;
			}
		}else{
			if(ticket.equals("Standard")){
				ticketsPrice = numberTickets * 110.10;
			}else if(ticket.equals("Premium")){
				ticketsPrice = numberTickets * 160.66;
			}else{
				ticketsPrice = numberTickets * 400;
			}
		}
		
		if(ticketsPrice > 4000){
			ticketsPrice -= ticketsPrice * 0.25;
		}else{
			if(ticketsPrice > 2500) ticketsPrice -= ticketsPrice * 0.1;
			if(tropheyPic == 'Y') ticketsPrice += numberTickets * 40;
		}
		System.out.printf("%.2f",ticketsPrice);
	}
}