#include <stdio.h>
#define LIMIT 4000000

int main() {
    int value1 = 1;
    int curr_value = 2; 
    int sum = 0;

    while (curr_value <= LIMIT) {
        if (curr_value % 2 == 0) {
            sum += curr_value;
        }
        int tmp = curr_value;
        curr_value = curr_value + value1;
        value1 = tmp;
    }
    printf("%d\n", sum);
    return 0;

}