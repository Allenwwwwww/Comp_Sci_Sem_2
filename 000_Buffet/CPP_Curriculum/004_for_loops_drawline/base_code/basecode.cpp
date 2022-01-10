// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
char sym;
int length = 0;
char orientation;
	cout << "Enter a Character - " << endl;
	cin >> sym;
	cout << "Enter a horizontal length" << endl;
	cin >> length;
	cout << "Horizontal or Vertical (V/H)" << endl;
	cin >> orientation;
	cout << "------------" << endl;
	if(orientation == 'H'){
		for( int count = 1; count <= length; count = count + 1){
		cout << sym;
		}
		}
		if(orientation == 'V'){
			for(int count = 1; count <= length; count = count + 1){
				cout << sym << endl;
			}
		}
}
