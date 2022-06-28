```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.nextLine().toCharArray();
        char A = sc.nextLine().charAt(0);
        char A1 = A;
        if(A1 >= 'a' && A1 <= 'z') {
            A1 = (char)(A1 - 'a' + 'A');
        } else if(A1 >= 'A' && A1 <= 'Z') {
            A1 = (char)(A1 - 'A' + 'a');
        }
        int cnt = 0;
        for(char ch : arr) {
            if(A == ch || A1 == ch) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
```
