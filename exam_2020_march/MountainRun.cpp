#include <iostream>
#include <cmath>

using namespace std;

int main()
{
	double record;
	cin >> record;
	
	double distance;
	cin >> distance;
	
	double timePerMeter;
	cin >> timePerMeter;
	
	double attempt = (distance * timePerMeter) + floor(distance / 50.0) * 30;
	
	cout.setf(ios::fixed);
	cout.precision(2);
	
	if(attempt < record)
		cout << " Yes! The new record is " << attempt << " seconds." << endl;
	else
		cout << "No! He was " << attempt - record << " seconds slower." << endl;
	 
	return 0;
}