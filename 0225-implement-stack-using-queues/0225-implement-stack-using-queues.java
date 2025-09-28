class MyStack {
    Stack<Integer> s;
    public MyStack() {
        this.s=new Stack<>();
    }
    
    public void push(int x) {
        s.push(x);
    }
    
    public int pop() {
        // if(!s.isEmpty())
        //     return s.pop();
        return s.pop();
    }
    
    public int top() {
        // if(!s.isEmpty())
        //     return s.peek();
        return s.peek();
    }
    
    public boolean empty() {
        if(s.isEmpty())
            return true;
        else
            return false;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */