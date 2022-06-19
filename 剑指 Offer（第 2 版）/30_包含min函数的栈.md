## 包含min函数的栈
### https://leetcode.cn/problems/bao-han-minhan-shu-de-zhan-lcof/
```java
class MinStack {
    LinkedList<Integer> s1 = new LinkedList<>();
    LinkedList<Integer> s2 = new LinkedList<>();
    /** initialize your data structure here. */
    public MinStack() {
    }
    
    public void push(int x) {
        s1.addLast(x);
        if(s2.isEmpty()) {
            s2.addLast(x);
        } else {
            s2.addLast(Math.min(x, s2.getLast()));
        }
    }
    
    public void pop() {
        s2.removeLast();
        s1.removeLast();
    }
    
    public int top() {
        return s1.getLast();
    }
    
    public int min() {
        return s2.getLast();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.min();
 */
```
