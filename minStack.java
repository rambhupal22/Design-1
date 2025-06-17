
// Time Complexity :O(1)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no
import java.util.Stack;

class MinStack {
    Stack<Integer>mainStack;// holds every value
    Stack<Integer>minStack; //track the min values only

    public MinStack() {
        mainStack = new Stack<>();
        minStack = new Stack<>();

        
    }
    
    public void push(int val) { 
        mainStack.push(val); //pushing new val in to main and checking for minstack too if it less than  or equal to  the top value of minstack then push the val to minstack too
        if(minStack.isEmpty() || val<=minStack.peek()){
            minStack.push(val);
        }
        
    }
    
    public void pop() {
        int removed=mainStack.pop();// if removed element in mainstack is equal to top element of minstack remove in minstack too
        if(removed == minStack.peek())
        minStack.pop();
        
    }
    
    public int top() {
        return mainStack.peek();// return the peek element of mainstack
        
    }
    
    public int getMin() {
        return minStack.peek();// return the peek element of minstack by using getMin
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */