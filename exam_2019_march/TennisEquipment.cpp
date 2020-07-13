#include <iostream>
#include <cmath>

using namespace std;

int main(){
	
	double racketPrice;
	cin >> racketPrice;
	
	int rackets;
	cin >> rackets;
	
	int sneakers;
	cin >> sneakers;
	
	double sneakersPrice = racketPrice / 6.0;
		
		double racketsSneakersPrice = racketPrice * rackets + sneakersPrice * sneakers;
		
		double totalPrice = racketsSneakersPrice + racketsSneakersPrice * 0.2;
		
		int Djokovich = (int)floor(totalPrice / 8.0);
		int sponsors =  (int)ceil((7 * totalPrice) / 8.0);
		
		cout << "Price to be paid by Djokovic " << Djokovich << endl;
		cout << "Price to be paid by sponsors " << sponsors << endl;
}