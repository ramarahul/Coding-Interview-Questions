class FreqStack {
    
    private Map<Integer,Integer> freq;
    private Map<Integer, Stack<Integer>> fs;
    private int maxFreq;

    public FreqStack() {
        freq = new HashMap<>();
        fs = new HashMap<>();
        maxFreq = 0;
        
    }
    
    public void push(int val) {
        freq.put(val,freq.getOrDefault(val,0)+1);
        fs.computeIfAbsent(freq.get(val), s -> new Stack<Integer>()).add(val);
        //Lambda operator used to create stack above. Can be done without lambada operator too
        maxFreq = Math.max(maxFreq,freq.get(val));
        
    }
    
    public int pop() {
        int val = fs.get(maxFreq).pop();
        if(fs.get(maxFreq).isEmpty()){
            maxFreq--;
        }
        freq.put(val,freq.getOrDefault(val,0)-1);
        return val;
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */
