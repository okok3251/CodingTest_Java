import java.util.*;

class Solution {
    public int solution(String s) {
        MyStack stack = new MyStack(s.length());
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(stack.isEmpty()){
                stack.push(c);
            }else{
                if(c == stack.peek()){
                    stack.pop();
                }else{
                    stack.push(c);
                }
            }
        }
        return stack.isEmpty() ? 1 : 0;
    }

    
    class MyStack {
        private int capacity;
        private int top;
        private Character[] stackArr;

        public MyStack(int size) {
            capacity = size;
            top = -1;
            stackArr = new Character[size];
        }

        public boolean isFull() {
            return top == capacity - 1;
        }

        public boolean isEmpty() {
            return top == -1;
        }

        public void push(Character s) {
            if (isFull()) {
                throw new Error("Array is Full");
            } else {
                stackArr[++top] = s;
            }
        }

        public Character pop() { 
            if (isEmpty()) {
                throw new Error("Array is Empty");
            } else {
                Character top_v = stackArr[top];
                stackArr[top--] = null;
                return top_v;
            }
        }
        public Character peek(){
            if(isEmpty()){
                throw new Error("Array is Empty");
            }else{
                return stackArr[top];
            }
        }

        public void check() {
            System.out.println(Arrays.toString(stackArr));
        }
    }
}
