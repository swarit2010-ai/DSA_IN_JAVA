public class Pro_38 {
    public static void main(String[] args) {
        int u = 0;
        char a = 'u';// a = A,o,e,u

        switch (a) {
            case 'a': /*u =u + 1;*/ break;
            case 'e': /*u += 1;*/
            case 'i':/* u += 1;*/ break;
            case 'o': u += 1; System.out.println(u + " ");
            case 'u': u += 1; System.out.println(u); break;
            default: System.out.println("Test");
        }
        System.out.println("Computer");
    }
}
