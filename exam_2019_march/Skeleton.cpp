#include <iostream>

using namespace std;

int main(){
	
	int mins;
	cin >> mins;
	
	int secs;
	cin >> secs;
	
	double len;
	cin >> len;
	
	int hundredMetresTime;
	cin >> hundredMetresTime;

	int controlTime = mins * 60 + secs;
		
	double timeReduction=  (len / 120.0) * 2.5;
		
	double timeMartin = (len / 100.0) * hundredMetresTime - timeReduction;

	cout.setf(ios::fixed);
	cout.precision(3);

	if(timeMartin <= controlTime){
		cout << "Marin Bangiev won an Olympic quota!" << endl;
		cout << "His time is " << timeMartin << "." << endl;
	}else{
		cout << "No, Marin failed! He was " << timeMartin - controlTime << " second slower.";
	}

	return 0;
}