#include <iostream>
#include <cmath>

using namespace std;

int main()
{
	int days;
	cin >> days;
	
	double totalFood;
	cin >> totalFood;
	
	double dogFood = 0.0;
	double catFood = 0.0;
	double biscuits = 0.0;
	
	for(int i = 1; i <= days; i++){
			int dogDailyFood;
			cin >> dogDailyFood;
			
			int catDailyFood;
			cin >> catDailyFood;
		
			dogFood += dogDailyFood;
			catFood += catDailyFood;
		
			if(i%3 == 0){
				biscuits += (dogDailyFood + catDailyFood) * 0.1;
			}
	}
	
	double eatenFood = dogFood + catFood;
	
		double eatenFoodPercentage = (eatenFood * 100) / totalFood;
		double dogFoodPercentage = (dogFood * 100) / eatenFood;
		double catFoodPercentage = (catFood * 100) / eatenFood;
		biscuits = round(biscuits);

	cout.setf(ios::fixed);
	cout.precision(0);
	
	cout << "Total eaten biscuits: " << biscuits << "gr." << endl;
	
	cout.setf(ios::fixed);
	cout.precision(2);
	
	cout << eatenFoodPercentage << "% of the food has been eaten." << endl;
	cout << dogFoodPercentage << "% eaten from the dog." << endl;
	cout << catFoodPercentage << "% eaten from the cat." << endl;
	return 0;
}