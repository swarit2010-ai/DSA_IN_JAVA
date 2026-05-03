// WAP to print all substrings of a string
public class Pro_08{
    public static void main(String[] args) {
        String s = "Gopi";
        for(int i = 0;i < s.length();i++){
            for(int j = i;j < s.length();j++){
                System.out.print(s.substring(i,j+1) + " ");
            }
        }
    }
}