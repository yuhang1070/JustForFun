```java
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        boolean[] arr = new boolean[501];
        for(int i = 0; i < N; i++) {
            arr[Integer.parseInt(sc.nextLine())] = true;
        }
        for(int i = 1; i < 501; i++) {
            if(arr[i]) {
                System.out.println(i);
            }
        }
    }
}
```
