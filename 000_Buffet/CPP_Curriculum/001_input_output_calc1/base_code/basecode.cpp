// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here;
	int num1 = 0;
	cout << "Please enter an integer:)" << endl;
	cin >> num1;
	int num2 = 0;
	cout << "Please enter another integer:)" << endl;
	cin >> num2;
	int answer = num1*num2;
	cout<<"The answer is " << answer << endl;
}
