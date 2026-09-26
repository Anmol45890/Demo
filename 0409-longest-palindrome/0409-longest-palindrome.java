class Solution {
    
    public int longestPalindrome(String s) {
        HashMap<Character,Integer>freq = new HashMap<>();

        for(char c: s.toCharArray()){
            freq.put(c,freq.getOrDefault(c,0)+1);
        }

        int res = 0;
        boolean odd = false;

        for(int val : freq.values()){
            if(val%2 ==0){
                res += val;
            }
            else{
                res += val-1;
                odd = true;
            }
        }
        if(odd){
            res += 1;
        }
        return res;
    }
}