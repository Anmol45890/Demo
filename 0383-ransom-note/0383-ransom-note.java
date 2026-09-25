class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        HashMap<Character, Integer> have = new HashMap<>();
        HashMap<Character, Integer> need = new HashMap<>();

        // Count characters needed
        for (char c : ransomNote.toCharArray()) {
            need.put(c, need.getOrDefault(c, 0) + 1);
        }

        // Count characters available
        for (char c : magazine.toCharArray()) {
            have.put(c, have.getOrDefault(c, 0) + 1);
        }

        // Compare
        for (Map.Entry<Character, Integer> i : need.entrySet()) {

            char c = i.getKey();
            int fneed = i.getValue();
            int fhave = have.getOrDefault(c, 0);

            if (fhave < fneed) {
                return false;
            }
        }

        return true;
    }
}