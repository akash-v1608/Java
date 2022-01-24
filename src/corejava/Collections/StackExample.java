package corejava.Collections;
import java.util.*;
class MyStack{
    Stack<Integer> st;
    MyStack()
    {
        st=new Stack();
    }
    void push(int num)
    {
        st.push(num);
    }
    int pop()
    {
        if(st.size()>0)
            return st.pop();

        return -1;
    }
    int getSize()
    {
        return st.size();
    }
    int getTopElement()
    {
        if(st.size()>0)
            return st.peek();

        return -1;
    }
}

class StackExample
{
    public static void main(String[] args)
    {
        MyStack st=new MyStack();
        st.push(0);
        st.push(1);
        st.push(2);
        System.out.println("size of stack :" + st.getSize());
        System.out.println("top element in stack: "+st.getTopElement());
        st.pop();
        while(st.getSize()>0)
        {
            int x=st.pop();
            System.out.print(x+" ");
        }
    }
}
