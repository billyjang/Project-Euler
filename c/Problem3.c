#include <stdio.h>
#include <math.h>

int isPrime(long);

int main() {
    long limit = 600851475143;
    long minFactor = 2;

    while(minFactor < (limit/2)) {
        if (limit % minFactor == 0) {
            long factor = limit/minFactor;
            if(isPrime(factor) == 1) {
                printf("%ld\n", factor);
                break;
            } else {
                limit = factor;
            }
        }
        minFactor = minFactor + 1;
    }
    return 0;
}

/*
* Checks to see if number is prime
*/
int isPrime(long num) {
    int prime = 1; 
    int count = 2;
    while(count < sqrt(num)) {
        if(num%count == 0) {
            prime = 0;
            break;
        }
        count = count + 1;
    }
    return prime;
}