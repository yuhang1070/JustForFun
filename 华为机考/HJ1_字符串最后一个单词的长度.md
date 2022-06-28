```java
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.nextLine().toCharArray();
        int i = arr.length - 1;
        while(i > -1 && arr[i] != ' ') {
            i--;    
        }
        System.out.println(arr.length - i - 1);
    }
}
```
