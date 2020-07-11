#include <iostream>
#include <string>

using namespace std;

int main()
{
	int n;
	cin >> n;
	cin.ignore();
	
	double totalMoney = 0.0;	
	int winDays = 0;
	string input;// should be initialized outside (before) the embedded loops
	string result;// should be initialized outside (before) the embedded loops
	for(int i = 0; i < n; i++){
			
		int wins = 0;
		int losses = 0;	
		double dayMoney = 0.0;
			
	    getline(cin,input);
			
		while(input != "Finish"){
		
			getline(cin,result);
			
			if(result == "win"){
				dayMoney += 20;
				wins++;
			}else{
				losses++;
			}

			getline(cin,input);
		}
			
		if(wins > losses){
			dayMoney += dayMoney * 0.1;
			totalMoney += dayMoney;
			winDays++;
		}else{
			totalMoney += dayMoney;
		}
	}
	
	cout.setf(ios::fixed);
	cout.precision(2);
	
	if(winDays > n - winDays){
		totalMoney += totalMoney * 0.2;
		cout << "You won the tournament! Total raised money: " << totalMoney << endl;
	}else{
		cout << "You lost the tournament! Total raised money: " << totalMoney << endl;
	}
	
	return 0;
}