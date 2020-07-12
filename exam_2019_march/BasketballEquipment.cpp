#include <iostream>

using namespace std;

int main(){
	double fee;
	cin >> fee;

	double sneakers = fee - fee * 0.4;
	double shorts = sneakers - sneakers * 0.2;
	double ball = shorts * 0.25;
	double accessories = ball * 0.2;
	double total = fee + sneakers + shorts + ball + accessories;

	cout.setf(ios::fixed);
	cout.precision(2);

	cout << total << endl;

	return 0;
}