class Solution {
public:
    bool canConstruct(string ransomNote, string magazine) {

        unordered_map<char, int> have;
        unordered_map<char, int> need;

        // Count required characters
        for (char c : ransomNote) {
            need[c]++;
        }

        // Count available characters
        for (char c : magazine) {
            have[c]++;
        }

        // Compare
        for (auto i : need) {
            char c = i.first;
            int fneed = i.second;
            int fhave = have[c];

            if (fhave < fneed)
                return false;
        }

        return true;
    }
};