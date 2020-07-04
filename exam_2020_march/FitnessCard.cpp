#include <iostream>
#include <string>

using namespace std;

int main()
{
	double sum;
	cin >> sum;
	
	string sex;
	cin >> sex;
	
	int age;
	cin >> age;
	
	string sport;
	cin >> sport;
	
	double price = 0.0;
	
	if(sport == "Gym"){
		
		if(sex == "m"){
			price = 42;
			if(age <= 19) price -= price * 0.2;
		}else{
			price = 35;
			if(age <= 19) price -= price * 0.2;	
		}

	}else if(sport == "Boxing"){
		
		if(sex == "m"){
			price = 41;
			if(age <= 19) price -= price * 0.2;
		}else{
			price = 37;
			if(age <= 19) price -= price * 0.2;
		}
		
	}else if(sport == "Yoga"){
		
		if(sex == "m"){
			price = 45;
			if(age <= 19) price -= price * 0.2;
		}else{
			price = 42;
			if(age <= 19) price -= price * 0.2;
		}
		
	}else if(sport == "Zumba"){
		
		if(sex == "m"){
			price = 34;
			if(age <= 19) price -= price * 0.2;
		}else{
			price = 31;
			if(age <= 19) price -= price * 0.2;
		}
		
	}else if(sport == "Dances"){
		
		if(sex == "m"){
			price = 51;
			if(age <= 19) price -= price * 0.2;
		}else{
			price = 53;
			if(age <= 19) price -= price * 0.2;
		}
		
	}else if(sport == "Pilates"){
		
		if(sex == "m"){
			price = 39;
			if(age <= 19) price -= price * 0.2;
		}else{
			price = 37;
			if(age <= 19) price -= price * 0.2;
		}
		
	}
	
	cout.setf(ios::fixed);
	cout.precision(2);
	
	if(price < sum){
		cout << "You purchased a 1 month pass for " << sport << "." << endl;
	}else{
		cout << "You don't have enough money! You need $" << price - sum << " more." << endl;
	}
	 
	return 0;
}