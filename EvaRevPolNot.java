class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        
        for(int i = 0; i < tokens.length; i++) {
            if(tokens[i].equals("+")) {
                int n2 = stack.pop();
                int n1 = stack.pop();
                stack.push(n1 + n2);
            } else if(tokens[i].equals("-")) {
                int n2 = stack.pop();
                int n1 = stack.pop();
                stack.push(n1 - n2);
            } else if(tokens[i].equals("*")) {
                int n2 = stack.pop();
                int n1 = stack.pop();
                stack.push(n1 * n2);
            } else if(tokens[i].equals("/")) {
                int n2 = stack.pop(); 
                int n1 = stack.pop();
                stack.push(n1 / n2);
            } else {
                stack.push(Integer.parseInt(tokens[i]));
            }
        }
        
        return stack.peek();
    }
}