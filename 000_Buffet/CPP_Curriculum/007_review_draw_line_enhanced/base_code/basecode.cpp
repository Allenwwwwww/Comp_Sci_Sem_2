// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	char sym;
	int length = 0;
	int xc = 0;
	int yc= 0;
	cout << "We're making a line!!!" << endl;
	cout << "Please enter the desired length - " << endl;
	cin >> length;
	cout << "Please enter the desired ycoordinates - " << endl;
	cin >> yc;
	cout << "Now please enter the desired xcoordinates - " << endl;
	cin >> xc;
	cout << "Please enter the desired symbol - ";
	cin >> sym;
        for(int x = 0; x < length; x++){
           gotoxy(xc+x,5+yc);
           cout << sym;
        }
}
