```cpp
#include <cstdio>
using namespace std;
int main() {
    int n, tmpSum, maxSum;
    while(EOF != scanf("%d", &n)) {
        maxSum = tmpSum = 0;
        while(n != 0) {
            if(n & 1) {
                tmpSum++;
                if(tmpSum > maxSum) {
                    maxSum = tmpSum;
                }
            } else {
                tmpSum = 0;
            }
            n /= 2;
        }
        printf("%d\n", maxSum);
    }
    return 0;
}
```
