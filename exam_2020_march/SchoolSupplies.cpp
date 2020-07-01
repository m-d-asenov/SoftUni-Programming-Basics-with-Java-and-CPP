#include <iostream>

using namespace std;

int main()
{
	int pens;
	cin >> pens;
	
	int markers;
	cin >> markers;
	
	double cleaner;
	cin >> cleaner;
	
	double reduction;
	cin >> reduction;
	
	double pensPrice = pens * 5.8;
	double markersPrice = markers * 7.2;
	double cleanerPrice = cleaner * 1.2;
	
	double totalPrice = pensPrice + markersPrice + cleanerPrice;
	totalPrice -= reduction * totalPrice / 100;
	
	cout.setf(ios::fixed);
	cout.precision(3);
	cout << totalPrice;
}