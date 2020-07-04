#include <iostream>
#include <string>

using namespace std;

int main()
{
	string town;
	cin >> town;
	
	string extras;
	cin >> extras;
	
	string vip;
	cin >> vip;
	
	int days;
	cin >> days;
	
	if(days < 1){
		
		cout << "Days must be positive number!" << endl;
		return 0;
	}
	
	if(days > 7) days --;

	double price = 0.0;
	
	if( town == "Bansko" || town == "Borovets" ){

			if(extras == "withEquipment"){
	
				price = 100 * days;
				if( vip == "yes" ) price -= price*0.1;
				 
		
			}else if( extras == "noEquipment" ){
	
				price = 80 * days;
				if( vip == "yes") price -= price*0.05;
	
			}else{
				cout << "Invalid input!" << endl;
				return 0;
			}

	}else if(town == "Varna" || town == "Burgas"){

			if(extras == "withBreakfast"){
	
				price = 130 * days;
				if( vip == "yes") price -= price*0.12;
	
			}else if(extras == "noBreakfast"){
	
				price = 100 * days;
				if( vip == "yes") price -= price*0.07;
	
			}else{
	
				cout << "Invalid input!" << endl;
				return 0;
			}

	} else{

			cout << "Invalid input!" << endl;
			return 0;			
	}
	
	cout.setf(ios::fixed);
	cout.precision(2);
		
	cout << "The price is " << price << "lv! Have a nice time!" << endl;
	 
	return 0;
}