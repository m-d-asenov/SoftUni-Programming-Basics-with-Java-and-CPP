#include <iostream>
#include <cmath>;

using namespace std;

int main()
{
	int visitors;
	cin >> visitors;
	
	double entranceFee;
	cin >> entranceFee;
	
	double shezlongFee;
	cin >> shezlongFee;
	
	double umbrellaFee;
	cin >> umbrellaFee;
	
	double totalFee = entranceFee * visitors + ceil(visitors * 0.5) * umbrellaFee + ceil(visitors * 0.75) * shezlongFee;
	
	cout.setf(ios::fixed);
	cout.precision(2);
	
	cout << totalFee << " lv." << endl;
	
	return 0;
}