#include <iostream>
using namespace std;

// 		 Suppose that it’s hot if the temperature is higher than 30 degrees,
//     that it’s cold if the temperature is lower than 10 degrees,
//     and that it’s ok otherwise.Moreover,
//     warn if with the given temperature water would boil,
//     or if water would freeze.Assume that water boils at 100 or more degrees,
//     and that water freezes at 0 or less degrees.>

int main() {
  int t;
  cin >> t;
	if (t > 30) {
		cout << "it's hot" << endl;
		if (t >= 100) {
			cout << "water would boil" << endl;
		}
	}
	else if (t < 10) {
		cout << "it's cold" << endl;
		if (t <= 0) { 
			cout << "water would freeze" << endl;
		}
	}
	else {
		cout << "it's ok" << endl;
	}
}