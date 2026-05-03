// WAP to count the number of vowels in string
public class Pro_03{
    public static void main(String[] args) {
        String str = "swarit";
        int c = 0;
        for(int i = 0;i < str.length();i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                c++;
            }
        }
        System.out.println(c);
    }
}
