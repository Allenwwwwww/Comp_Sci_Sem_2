// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	char sym;
	int length = 0;
	char orientation;
	int x = 1;
	int y = 10;
	
	cout << "Enter the symbol you'd ike to use - " << endl;
	cin >> sym;
	cout << "Horizontal Vertical or Diagonal (H/V/D)" << endl;
	cin >> orientation;
	cout << "Now what length would you like it to be" << endl;
	cin >> length;
	
		if(orientation == 'H'){
			cout << "You've chosen Horizontal, this is your line" << endl;
				for(int count = 0; count < length; count = count + 1){
					cout << sym;
				}
		}
		
		if(orientation == 'V'){
			cout << "You've chosen Vertical, this is your line" << endl;
				for(int count = 0; count < length; count = count + 1){
					cout << sym;
				}
		}

		if(orientation == 'D'){
			cout << "You've chosen Diagonal, this is your line" << endl;
				for(int count = 0; count < length; count = count + 1){
					gotoxy(x,y);
					x = x + 1;
					y = y + 1; 
					cout << sym << endl;
				}
		}
	}
