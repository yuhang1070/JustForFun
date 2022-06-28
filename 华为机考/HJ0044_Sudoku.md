```java
import java.util.*;
public class Main {
    public static boolean dfs(int[][] mat, 
                              ArrayList<Integer> iLst, 
                              ArrayList<Integer> jLst,
                             int now) {
        if(now == iLst.size()) {
            return true;
        }
        int i = iLst.get(now), j = jLst.get(now);
        int x = i / 3, y = j / 3;
        HashSet<Integer> set = new HashSet<Integer>();
        for(int p = x * 3; p < x * 3 + 3; p++) {
            for(int q = y * 3; q < y * 3 + 3; q++) {
                set.add(mat[p][q]);
            }
        }
        for(int p = 0; p < 9; p++) {
            set.add(mat[i][p]);
            set.add(mat[p][j]);
        }
        for(int k = 1; k < 10; k++) {
            if(set.contains(k)) {
                continue;
            }
            mat[i][j] = k;
            if(dfs(mat, iLst, jLst, now + 1)) {
                return true;
            }
            mat[i][j] = 0;
        }
        return false;
    }
    public static void solve(int[][] mat) {
        ArrayList<Integer> iLst = new ArrayList<Integer>();
        ArrayList<Integer> jLst = new ArrayList<Integer>();
        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                if(mat[i][j] == 0) {
                    iLst.add(i);
                    jLst.add(j);
                }
            }
        }
        dfs(mat, iLst, jLst, 0);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] mat = new int[9][9];
        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        solve(mat);
        for(int i = 0; i < 9; i++) {
            System.out.print(mat[i][0]);
            for(int j = 1; j < 9; j++) {
                System.out.print(" " + mat[i][j]);
            }
            System.out.println();
        }
    }
}
```
