class Solution {
public:
    int longestPalindrome(string s) {
        unordered_map<char, int> freq;

        // Count frequency of each character
        for (char c : s) {
            freq[c]++;
        }

        int res = 0;
        bool odd = false;

        // Take all even frequencies
        for (auto i : freq) {
            int val = i.second;

            if (val % 2 == 0) {
                res += val;
            } 
            else {
                res += val - 1;
                odd = true;
            }
        }

        // One odd character can be placed in the center
        if (odd) {
            res += 1;
        }

        return res;
    }
};