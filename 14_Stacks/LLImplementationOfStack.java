class MyStack{
    Node head;
    int size;
    int peek(){
        return head.val;
    }
    int pop() throws Exception{
        if(size == 0) throw new Exception("Stack Underflow error");
        int x = head.val;
        head = head.next;
        size--;
        return x;
    }
    void push(int val){
        Node new_node = new Node(val);
        if(size == 0) head = new_node;
        else{
            new_node.next = head;
            head = new_node;
        }
        size++;
    }
    int size(){
        return size;
    }
    void display(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
}
public class LLImplementationOfStack{
    public static void main(String[] args) throws Exception{
        MyStack st = new MyStack();
        st.pop();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);
        st.display();
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.peek());
        st.push(50);
        System.out.println(st.size());
        st.display();
    }
}