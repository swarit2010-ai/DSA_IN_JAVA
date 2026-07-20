/*You are given a string s containing only lowecase letters. You need to count the number of vowels and the number of consonants.

If vowel count > consonant count then print - “Yes”(without quotes).
If vowel count < consonant count then print - “No”(without quotes).
If vowel count = consonant count then print - “Same”(without quotes).
Examples:

Input: s = thequickbrownfoxjumpsoverthelazydog
Output: No
Input: s = aaaaaa
Output: Yes
Input: s = abab
Output: Same
Constraints:
1 <= |s| <= 100

 */
public class Pro_02{
    public static void main(String[] args) {
    }
    static void checkString(String s) {
        int v = 0;
        int c = 0;
        // Your code here
        for(int i = 0;i < s.length();i++){
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') v++;
            else c++;
        }
        if (v > c)
            System.out.print("Yes");
        else if (c > v)
            System.out.print("No");
        else
            System.out.print("Same");
        System.out.println();
    }
}