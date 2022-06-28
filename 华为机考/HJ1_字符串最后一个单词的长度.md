```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.nextLine().toCharArray();
        int i = arr.length - 1;
        while(i > -1 && arr[i] != ' ') {
            i--;    
        }
        if(i == -1) {
            System.out.println(arr.length);
        } else {
            System.out.println(arr.length - i - 1);
        }
    }
}
```
