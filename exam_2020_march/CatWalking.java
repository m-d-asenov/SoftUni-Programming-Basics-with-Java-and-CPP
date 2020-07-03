import java.util.Scanner;

public class CatWalking 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

		int minPerWalk = Integer.parseInt(sc.nextLine());
		int walks = Integer.parseInt(sc.nextLine());
		int calories = Integer.parseInt(sc.nextLine());
		
		int burntCal = minPerWalk * walks * 5;
		
		if(burntCal >= calories * 0.5)
			System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %d.", burntCal);
		else
			System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %d.", burntCal);
    }
}