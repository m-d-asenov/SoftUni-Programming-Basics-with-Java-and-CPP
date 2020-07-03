#include <iostream>

using namespace std;

int main()
{
	double budget;
	cin >> budget;
	
	int video;
	cin >> video;
	
	int processor;
	cin >> processor;
	
	int ram;
	cin >> ram;
	
	double videoMoney =  250 * video;
	double processorMoney = videoMoney * 0.35 * processor;
	double ramMoney = videoMoney * 0.1 * ram;
	
	double total = videoMoney + processorMoney + ramMoney;
	
	if(video > processor) total -= total * 0.15;
	
	cout.setf(ios::fixed);
	cout.precision(2);
	
	if(budget >= total)
		cout << "You have " << budget - total << " leva left!" << endl;
	else
		cout << "Not enough money! You need " << total - budget << " leva more!" << endl;
	 
	return 0;
}