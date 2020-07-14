import java.util.Scanner;

public class Skeleton{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		
		int mins = Integer.parseInt(sc.nextLine());
		int secs = Integer.parseInt(sc.nextLine());
		double len = Double.parseDouble(sc.nextLine());
		int hundredMetresTime = Integer.parseInt(sc.nextLine());
		
		int controlTime = mins * 60 + secs;
		
		double timeReduction=  (len / 120.0) * 2.5;
		
		double timeMartin = (len / 100.0) * hundredMetresTime - timeReduction;
		
		if(timeMartin <= controlTime){
			System.out.println("Marin Bangiev won an Olympic quota!");
			System.out.printf("His time is %.3f.", timeMartin);
		}else{
			System.out.printf("No, Marin failed! He was %.3f second slower.", timeMartin - controlTime);
		}
	}
}