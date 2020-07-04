import java.util.Scanner;

public class FitnessCard 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

		double sum = Double.parseDouble(sc.nextLine());
		String sex = sc.nextLine();
		int age = Integer.parseInt(sc.nextLine());
		String sport = sc.nextLine();
		
		double price = 0.0;

		if(sport.equals("Gym")){
		
		if(sex.equals("m")){
			price = 42;
			if(age <= 19) price -= price * 0.2;
		}else{
			price = 35;
			if(age <= 19) price -= price * 0.2;	
		}

	}else if(sport.equals("Boxing")){
		
		if(sex.equals("m")){
			price = 41;
			if(age <= 19) price -= price * 0.2;
		}else{
			price = 37;
			if(age <= 19) price -= price * 0.2;
		}
		
	}else if(sport.equals("Yoga")){
		
		if(sex.equals("m")){
			price = 45;
			if(age <= 19) price -= price * 0.2;
		}else{
			price = 42;
			if(age <= 19) price -= price * 0.2;
		}
		
	}else if(sport.equals("Zumba")){
		
		if(sex.equals("m")){
			price = 34;
			if(age <= 19) price -= price * 0.2;
		}else{
			price = 31;
			if(age <= 19) price -= price * 0.2;
		}
		
	}else if(sport.equals("Dances")){
		
		if(sex.equals("m")){
			price = 51;
			if(age <= 19) price -= price * 0.2;
		}else{
			price = 53;
			if(age <= 19) price -= price * 0.2;
		}
		
	}else if(sport.equals("Pilates")){
		
		if(sex.equals("m")){
			price = 39;
			if(age <= 19) price -= price * 0.2;
		}else{
			price = 37;
			if(age <= 19) price -= price * 0.2;
		}	
	}
		
	if(price < sum)
		System.out.printf("You purchased a 1 month pass for %s.", sport);
	else
		System.out.printf("You don't have enough money! You need $%.2f more.", price - sum);
    }
}