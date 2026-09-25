class Solution {
public:
    int firstUniqChar(string s) {
        int n =s.size();
        unordered_map<char,int>firstUniqChar;
        int i;
        for(int i =0; i<n; i++)
        firstUniqChar[s[i]]++;

        for( i=0; i<n; i++){
            if(firstUniqChar[s[i]]==1)
            return i;

        }
        return -1;
    }
};