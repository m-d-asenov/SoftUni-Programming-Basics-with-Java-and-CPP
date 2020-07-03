import java.lang.Math;
import java.util.Scanner;

public class MountainRun 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

		double record = Double.parseDouble(sc.nextLine());
		double distance = Double.parseDouble(sc.nextLine());
		double timePerMeter = Double.parseDouble(sc.nextLine());
		
		double attempt = (distance * timePerMeter) + Math.floor(distance / 50.0) * 30;
		
		if(attempt < record)
			System.out.printf(" Yes! The new record is %.2f seconds.", attempt);
		else
			System.out.printf("No! He was %.2f seconds slower.", attempt - record);
    }
}