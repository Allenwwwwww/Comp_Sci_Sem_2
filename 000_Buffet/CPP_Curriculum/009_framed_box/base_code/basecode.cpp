// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	int length;
	int width;
	char sym;
		cout << "We're drawing a framed box!" << endl;
		cout << "Please enter the desired box length - ";
		cin >> length;
		cout << "Please enter the desired box width - ";
		cin >> width;
		cout << "PLease choose the symbol you'd like to use - ";
		cin >> sym;
			for(int y = 0; y < length; y++){
				for(int x = 0; x < width; x++){
					gotoxy(y+1,x+1);
					cout << sym;
				}
				cout << endl;
			}
}
