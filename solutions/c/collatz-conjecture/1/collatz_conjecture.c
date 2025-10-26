#include "collatz_conjecture.h"
int steps(int start){
    int c = 0;
    
    if(start <= 0){
        return -1;
    }
    
    while (start != 1) {
        if (start % 2 == 0){
            start = start/2;
            c++;
        } else {
            start = start*3+1;
            c++;
        }
    }
    
    return c;
}