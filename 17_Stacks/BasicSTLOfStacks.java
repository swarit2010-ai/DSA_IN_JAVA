import java.util.Stack;

public class BasicSTLOfStacks{
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
        System.out.println(st.peek()); // underflow
        st.pop();
        st.push("Khushi");
        st.push("Preet");
        st.push("Rishika");
        st.push("Isha");
        st.push("Prayas");
        System.out.println(st.size());
        System.out.println(st); // A.S = O(n)
        st.pop();
        System.out.println(st.size());
        System.out.println(st);
        System.out.println(st.peek());
        System.out.println(st.pop()); // first print then remove
        System.out.println(st);
    }
}