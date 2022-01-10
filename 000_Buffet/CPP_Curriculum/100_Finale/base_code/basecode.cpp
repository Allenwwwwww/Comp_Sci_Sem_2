// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	
	// First Present
for(int y = 0; y < 4; y++){
	for(int x = 0; x < 6; x++){
		gotoxy(4+x,4+y);
		cout << "#";
		}
	}
for(int y = 0; y < 2; y++){
	for(int x = 0; x < 4;x++){
		gotoxy(5+x,5+y);
		cout << " ";
		}
	}
	gotoxy(6,3);
	cout << "><";
	
	
	// Second Present
	for(int y = 0; y < 4; y++){
		for(int x = 0; x < 6; x++){
			gotoxy(15+x,4+y);
			cout << "#";
		}
	}
	for(int y = 0; y < 2; y++){
		for(int x = 0; x < 4;x++){
			gotoxy(16+x,5+y);
			cout << " ";
		}
	}
	gotoxy(17,3);
	cout << "><";
	
	
	// Third Present
		for(int y = 0; y < 3;y++){
			for(int x = 0; x < 4;x++){
				gotoxy(5+x,11+y);
				cout << "#";
			}
		}
		for(int y = 0; y < 1;y++){
			for(int x = 0; x < 2;x++){
				gotoxy(6+x,12+y);
				cout << " ";
			}
		}
		gotoxy(6,10);
		cout << "><";
		
		
// Snow
gotoxy(11,9);
cout << "*";
gotoxy(35,5);
cout << "*";
gotoxy(30,3);
cout << "*";
gotoxy(1,7);
cout << "*";
gotoxy(17,12);
cout << "*";
gotoxy(25,11);
cout << "*";
gotoxy(25,5);
cout << "*";
gotoxy(5,9);
cout << "*";
gotoxy(18,9);
cout << "*";
gotoxy(30,8);
cout << "*";
gotoxy(28,6);
cout << "*";
gotoxy(39,11);
cout << "*";
gotoxy(34,8);
cout << "*";
gotoxy(1,3);
cout << "*";


// Christmas Tree
gotoxy(40,3);
cout << "><";
gotoxy(39,4);
cout << "****";
gotoxy(38,5);
cout << "******";
gotoxy(37,6);
cout << "********";
gotoxy(36,7);
cout << "**********";
gotoxy(40,8);
cout << "||";
gotoxy(39,7);
cout << "a";
gotoxy(41,5);
cout << "a";
gotoxy(43,7);
cout << "a";
gotoxy(38,5);
cout << "a";


// Mini Present
for(int y = 0; y < 3;y++){
	for(int x = 0; x < 4;x++){
		gotoxy(43+x,10+y);
		cout << "#";
		}
	}
	for(int y = 0; y < 1;y++){
		for(int x = 0; x < 2; x++){
			gotoxy(44+x,11);
			cout << " ";
		}
	}
	gotoxy(44,9);
	cout << "><";
}