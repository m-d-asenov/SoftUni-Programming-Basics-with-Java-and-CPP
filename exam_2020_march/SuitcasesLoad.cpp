#include <iostream>

using namespace std;

int main()
{
	double space;
	cin >> space;
	cin.ignore();
	
	int suitcases = 0;
	
	string input;
	getline(cin, input);
	
	while( input != "End"){
	
		double suitcase = stod(input);
		
		if((suitcases + 1) % 3 == 0){
					
			suitcase += suitcase * 0.1;
		}
		if(space - suitcase < 0){
			cout << "No more space!" << endl;
			cout << "Statistic: " << suitcases << " suitcases loaded." << endl;
			return 0;
		}
		space -= suitcase;
		suitcases++; 
		
		getline(cin,input);
	}
	cout << "Congratulations! All suitcases are loaded!" << endl;
	cout << "Statistic: " << suitcases << " suitcases loaded." << endl;
 
	return 0;
}