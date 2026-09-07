class Solution {

    public void reverseStringHelper(char[] s, int start, int end) {

        // Base case
        if (start >= end)
            return;

        // Swap
        char temp = s[start];
        s[start] = s[end];
        s[end] = temp;

        // Recursive call
        reverseStringHelper(s, start + 1, end - 1);
    }

    public void reverseString(char[] s) {
        reverseStringHelper(s, 0, s.length - 1);
    }
}