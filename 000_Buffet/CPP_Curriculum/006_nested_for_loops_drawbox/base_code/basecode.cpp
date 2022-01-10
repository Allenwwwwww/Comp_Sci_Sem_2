// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
    for(int y = 1; y < 8; y++){
        for(int x = 1; x < 5; x++){
            cout << "%";
        }
        cout <<endl;
    }
}
