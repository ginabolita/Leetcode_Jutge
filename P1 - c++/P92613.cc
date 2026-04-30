#include <iostream>
using namespace std;

int main() {
	double x;
	cin >> x;
	int floor = int(x);
  int is_integer = (int(x) == x);
	if (is_integer) {
		cout << floor << " " << floor << " " << floor << endl;
  }
	else {
		int ceiling = floor + 1;
		double dif = x-floor;
		// cout << dif << endl;
		if (dif < 0.5) {
			cout << floor << " " << ceiling << " " << floor << endl;
		}
		else {
      cout << floor << " " << ceiling << " " << ceiling << endl;
    }

	}
}