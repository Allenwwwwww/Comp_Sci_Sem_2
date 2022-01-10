// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
		char sym;
	int width = 0;
	int xc = 0;
	int yc= 0;
	int height = 0;
	cout << "Enter width - " << endl;
		cin >> width;
	cout << "Enter height - " << endl;
		cin >> height;
	cout << "Enter x-coordinate - " << endl;
		cin >> xc;
	cout << "Enter y-coordinate - " << endl;
		cin >> yc;
	cout << "Enter symbol you'd like to use - " << endl;
		cin >> sym;
		for(int y = 0; y < height;y++){
			for(int x = 0; x < width;x++){
				gotoxy(xc+x,yc+y);
				cout << sym;
				}
			}
		for(int y = 0; y < height-2;y++){
			for(int x = 0; x < width-2;x++){
				gotoxy(xc+1+x,yc+1+y);
				cout << " ";
				}
			}
}
