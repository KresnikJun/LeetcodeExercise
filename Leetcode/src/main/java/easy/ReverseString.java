package easy;

public class ReverseString {
    public void reverseString(char[] s) {
        int len = s.length;
        for (int i = 0; i < len/2; i++) {
            char a = s[i];
            s[i] = s[len - 1 - i];
            s[len - 1 - i] = a;
        }
    }
}
