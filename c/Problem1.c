#include <stdio.h>
#define LIMIT 1000

int main() {
    int sum = 0;
    int num = 1;

    while(num < LIMIT) {
        if ((num%3 == 0) || (num%5==0)) {
            sum += num;
        }
        num = num + 1;
    }

    printf("%d\n", sum);
    return 0;
}