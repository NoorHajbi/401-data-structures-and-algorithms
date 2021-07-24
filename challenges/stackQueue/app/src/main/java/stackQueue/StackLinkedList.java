package stackQueue;

import data.Node;

public class StackLinkedList<T> {
     public Node<T> top;

    //O(1)
    public void push(int value) {
        Node newNode = new Node(value);
        if (top == null)
            top = newNode;
        else {
            Node temp = top;
            top = newNode;
            newNode.next = temp;
        }
//        System.out.println(value + " pushed to stack");
    }

    public T pop() {
        if (top == null)
            throw new IllegalArgumentException("Stack is Empty");
            T popped = top.data;
            top = top.next;
            return popped;
    }

    public T peek() {
        if (top == null) {
            return (T)  "Stack is Empty, So the returned Peek-> ";
        } else
            return top.data;
    }

    //Returns: Boolean indicating whether or not the stack is empty.
    public boolean isEmpty() {
        return top == null;
    }

//    //Code Challenge 13
//
//    private boolean ArePair(String open, char close)
//    {
//        if (open.equals("(") && close == ')')
//            return true;
//        else if (open.equals("{") && close == '}')
//            return true;
//        else return open.equals("]") && close == ']';
//    }
//
//    public boolean validateBrackets(String exp) {
//        StackLinkedList<Character> stackList = new StackLinkedList<Character>();
//        for (int i = 0; i < exp.length(); i++)
//        {
//            if (exp.charAt(i) == '(' || exp.charAt(i) == '{' || exp.charAt(i) == '[')
//                stackList.push(exp.charAt(i));
//            else if (exp.charAt(i) == ')' || exp.charAt(i) == '}' || exp.charAt(i) == ']')
//            {
//                if (stackList.isEmpty() || !ArePair(stackList.top.toString(), exp.charAt(i)))
//                    return false;
//                else
//                    stackList.pop();
//            }
//        }
//        return stackList.isEmpty();
//    }

    @Override
    public String toString() {
        Node temp = this.top;
        StringBuilder output = new StringBuilder();
        if (temp == null) {
            return "Please fill the Linked List";
        }
        while (temp != null) {
            output.append("{ ").append(temp.data).append(" } -> ");
            temp = temp.next;
        }
        output.append("NULL");
        return output.toString();
    }
}
