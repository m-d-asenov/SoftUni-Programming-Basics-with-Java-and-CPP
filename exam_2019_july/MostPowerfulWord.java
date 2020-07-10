import java.util.Scanner;

public class MostPowerfulWord{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		
		int maxPower = 0;
		
		String winWord = "";
		
		
		while( !input.equals("End of words") ){
			
			int n = input.length();
			
			int values = 0;
			
			switch(input.charAt(0)){

				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
				case 'y':
				case 'A':
				case 'E':
				case 'I':
				case 'O':
				case 'U':
				case 'Y':
					for(int i = 0; i < n; i++){
					
						values += input.charAt(i);
					}
					values *= n;
					break;
					
				default:
					for(int i = 0; i < n; i++){
					
						values += input.charAt(i);
					}
					values = (int)Math.floor(values/n);
					break;
			}
			
			if(values >= maxPower){
				maxPower = values;
				winWord = input;
			} 
			
			if(sc.hasNext()) input = sc.nextLine();
		}
		
		System.out.printf("The most powerful word is %s - %d", winWord, maxPower);
	}
}