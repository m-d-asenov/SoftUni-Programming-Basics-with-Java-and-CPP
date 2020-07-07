#include <iostream>

using namespace std;

int main()
{
	string team;
	getline(cin,team);
	
	int matches;
	cin >> matches;
	
	if(matches == 0){
		cout << team << " hasn't played any games during this season." << endl;
		return 0;
	}
	
	int wins = 0;
	int losses = 0;
	int draws = 0;
	
	for(int i = 0; i < matches; i++){
		
		char result;
		cin >> result;
		
		if(result == 'W') wins += 3;
		else if(result == 'D') draws++;
		else losses++;
	}
	
	cout.setf(ios::fixed);
	cout.precision(2);
	
	cout <<  team << " has won " << wins + draws << " points during this season." << endl;
	cout << "Total stats:" << endl;
	cout << "## W: " << wins/3 << endl;
	cout << "## D: " << draws << endl;
	cout << "## L: " << losses << endl;
	cout << "Win rate: " << (wins/3) * 100 / (double)matches << "%" << endl;
	
	return 0;
}