class MyQueue {
    Queue<Integer> q;
    public MyQueue() {
        this.q=new LinkedList<>();
    }
    
    public void push(int x) {
        q.add(x);
    }
    
    public int pop() {
        return q.poll();
    }
    
    public int peek() {
        return q.peek();
    }
    
    public boolean empty() {
        if(q.isEmpty())
            return true;
        else
            return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */