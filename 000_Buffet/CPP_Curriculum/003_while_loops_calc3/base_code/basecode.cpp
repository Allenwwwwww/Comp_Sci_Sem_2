// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
while(true){
	int num1 = 0;
	cout << "Please enter a number - ";
	cin >> num1;
	int num2 = 0;
	cout << "Please enter another number - ";
	cin >> num2;
	cout << "Please enter an operand(Ex. +,-,*,/) - ";
	char operand;
	cin >> operand;
		if (operand == '+'){
			int answeradd = num1+num2;
			cout << "You've chosen addition, your answer is - " << answeradd << endl;
		}
		else if(operand == '-'){
			int answersub = num1-num2;
 			cout << "You've chosen subtraction, your answer is - " << answersub << endl;
		}
		else if(operand == '*'){
			int answermult = num1*num2;
			cout << "You've chosen multiplication, your answer is - " << answermult << endl;
		}
		else{
			int answerdiv = num1/num2;
			cout << "You've chosen division, your answer is - " << answerdiv << endl;
		}
		cout << "Would you like to do another?(Y/N)" << endl;
		char no = 'N';
		cin >> no;
			if(no == 'N' || 'n'){
				break;	
			 }
	}
}
		
	// int x = 0;
	// char quit = 'x';
	// 	while(true){
			
	// 		cout << "You've been gnomed";
	// 		cin >> quit;
			
	// 			if(quit == 'q'){
	// 				cout << "HOOOOG RIDAAAAA";
	// 				break;
	// 			}
				
	// 			if(x == 100){
	// 			break;
	// 			}
	// 		x = x + 1;
	// 	}
		
	// }
