#include <iostream>

using namespace std;

int main()
{
	int groups;
	cin >> groups;
	
	int Mussala = 0;
	int Monblan = 0;
	int Killiman = 0;
	int K2 = 0;
	int Everest = 0;
	int total = 0;
	
	 
	
	for(int i = 0; i < groups; i++){
		int group;
		cin >> group;
			
		total += group;
			 
		if(group <= 5) Mussala += group;
		else if( group > 5 && group <=12) Monblan += group;
		else if( group > 12 && group <=25) Killiman += group;
		else if( group > 25 && group <=40) K2 += group;
		else if( group > 40) Everest += group;
	}
	
	cout.setf(ios::fixed);
	cout.precision(2);
	
	cout << (Mussala * 100.0) / total << "%" << endl;
	cout << (Monblan * 100.0) / total << "%" << endl;
	cout << (Killiman * 100.0) / total << "%" << endl;
	cout << (K2 * 100.0) / total << "%" << endl;
	cout << (Everest * 100.0) / total << "%" << endl;
	 
	return 0;
}