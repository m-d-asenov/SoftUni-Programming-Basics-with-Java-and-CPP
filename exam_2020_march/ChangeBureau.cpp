#include <iostream>

using namespace std;

int main()
{
	int bitCoins;
	cin >> bitCoins;
	
	double yuans;
	cin >> yuans;
	
	double commiss;
	cin >> commiss;
	
	double levs = bitCoins * 1168 + yuans * 0.15 * 1.76;
	double euros = levs / 1.95;
	double result = euros - ( euros * ( commiss / 100.0 ) );
	
	cout.setf(ios::fixed);
	cout.precision(2);
	cout << result;
}