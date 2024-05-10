import java.util.Stack;

public class stack_reverse {
    public static void pushAtbottom(Stack<Integer>s,int data){
        if(s.isEmpty()){
            s.push(data);
        }
        int top=s.pop();
        pushAtbottom(s, data);
        s.push(top);
    }
    public static void reverse_stack(Stack<Integer>s){
        if(s.isEmpty()){
            return;
        }
        int top=s.pop();
        reverse_stack(s);
        pushAtbottom(s,top);
    }
    public static void printStack(Stack<Integer>s){
        while( !s.isEmpty()){
            System.out.println(s.pop());
            
        }
    }

public static void main(String args[]){
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        reverse_stack(s);
        printStack(s);
}
}
