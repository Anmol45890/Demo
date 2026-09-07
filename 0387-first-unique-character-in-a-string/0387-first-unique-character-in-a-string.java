class Solution {
    public int firstUniqChar(String s) {
        Map<Character,Integer> map = new HashMap<>();

        //app
        //{ a : 1 , p:2}

        for(char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c,0)+1);
        }

        // { a: 1 , p:2}
        // app
        //.i
        for(int i =0; i<s.length(); i = i+1){
            if(map.get(s.charAt(i))==1) {
              return i;
        }

    }
        return -1;

    }
}