#include <iostream>

using namespace std;

int main()
{
	double budget;
	cin >> budget;
	
	int nights;
	cin >> nights;
	
	double pricePerNight;
	cin >> pricePerNight;
	
	int additionalExpenses;
	cin >> additionalExpenses;
	
	double moneyNeeded = nights * pricePerNight + budget * (additionalExpenses / 100.0);
	
	if(nights > 7) moneyNeeded -= nights * pricePerNight * 0.05;
	
	cout.setf(ios::fixed);
	cout.precision(2);
	
	if(moneyNeeded <= budget)
			cout << "Ivanovi will be left with " << budget - moneyNeeded << " leva after vacation." << endl;
	else
			cout << moneyNeeded - budget << " leva needed." << endl;
	
	return 0;
}