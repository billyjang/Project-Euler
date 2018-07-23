#include <stdio.h>
#include <stdlib.h>

int isPalindrome(int);

int main() {
    int mult1 = 999;
    int mult2 = 999;
    while(mult1 > 100) {
        int tmp = mult1 * mult2;
        if(isPalindrome(tmp) == 1) {
            printf("%d\n", tmp);
            break;
        }
        if(mult1 > mult2) {
            mult1 = mult1 - 1;
        } else {
            mult2 = mult2 - 1;
        }
    }
    
    return 0;
}

//i'm pretty sure i should do something with malloc here but not yet
int isPalindrome(int test) {
    //int *number = (int *)malloc(sizeof(int));

}