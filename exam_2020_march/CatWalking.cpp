#include <iostream>

using namespace std;

int main()
{
	int minPerWalk;
	cin >> minPerWalk;
	
	int walks;
	cin >> walks;
	
	int calories;
	cin >> calories;
	
	int burntCal = minPerWalk * walks * 5;
	
	if(burntCal >= calories * 0.5)
		cout << "Yes, the walk for your cat is enough. Burned calories per day: " << burntCal << "." << endl;
	else
		cout << "No, the walk for your cat is not enough. Burned calories per day: " << burntCal << "." << endl;
	 
	return 0;
}