#include <iostream>

using namespace std;

int main()
{
	int nylon;
	cin >> nylon;
	
	int boya;
	cin >> boya;
	
	int razreditel;
	cin >> razreditel;
	
	int chasoveRabota;
	cin >> chasoveRabota;
	
	double materialiRazhodi = (nylon + 2) * 1.5 + (boya + boya * 0.1) * 14.5 + razreditel * 5 + 0.4;
	double rabotniciRazhodi = materialiRazhodi * 0.3 * chasoveRabota;
	double total = materialiRazhodi + rabotniciRazhodi;
	
	cout.setf(ios::fixed);
	cout.precision(2);
	
	cout << "Total expenses: " << total << " lv." << endl;
	
	return 0;
}