#include <iostream>

using namespace std;

int main()
{
	string input;
	getline(cin,input);
	
	int maxPoints = 0;
		
	string winner = "";
	
	while( input != "Stop" ){
	
		int n = input.length();
			
		int points = 0;
			
			for(int i = 0; i < n; i++){
				int num;
				cin >> num;
				
				if( num == input[i] ){
					points += 10;
				}else{
					points += 2;
				}
			}
			
			if(points >= maxPoints){
				maxPoints = points;
				winner = input;
			}
			
			getline(cin,input); 
	}
	cout << "The winner is " << winner << " with " << maxPoints << " points!" << endl;
	
	return 0;
}