import java.util.Scanner;

public class Gymnastics{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String country = sc.nextLine();
		String tool = sc.nextLine();
		double difficulty;
		double artisticity;
		
		if(country.equals("Russia")){
			if(tool.equals("ribbon")){
				difficulty = 9.100;
				artisticity = 9.400;
			}else if(tool.equals("hoop")){
				difficulty = 9.300;
				artisticity = 9.800;
			}else{
				difficulty = 9.600;
				artisticity = 9.000;
			}
			
		}else if(country.equals("Bulgaria")){
			if(tool.equals("ribbon")){
				difficulty = 9.600;
				artisticity = 9.400;
			}else if(tool.equals("hoop")){
				difficulty = 9.550;
				artisticity = 9.750;
			}else{
				difficulty = 9.500;
				artisticity = 9.400;
			}
		}else{
			if(tool.equals("ribbon")){
				difficulty = 9.200;
				artisticity = 9.500;
			}else if(tool.equals("hoop")){
				difficulty = 9.450;
				artisticity = 9.350;
			}else{
				difficulty = 9.700;
				artisticity = 9.150;
			}
		}
		
		double score = difficulty + artisticity;
		double percentage = (20 - score) * 100 / 20.0;
		
		System.out.printf("The team of %s get %.3f on %s.%n", country, score, tool);
		System.out.printf("%.2f%%", percentage);
	}
}