class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) {
            return false;
        }

        int[] s1Frequency = new int[26];
        int[] s2Frequency = new int[26];

        for(int i = 0; i < s1.length(); i++) {
            s1Frequency[s1.charAt(i) - 'a']++;
            s2Frequency[s2.charAt(i) - 'a']++;
        }

        for(int i = 0; i < s2.length() - s1.length(); i++) {
            if(stringMatch(s1Frequency, s2Frequency)) {
                return true;
            }

            s2Frequency[s2.charAt(i + s1.length()) - 'a']++;
            s2Frequency[s2.charAt(i) - 'a']--;
        }
        return stringMatch(s1Frequency, s2Frequency);
    }

    private boolean stringMatch(int[] s1Frequency, int[] s2Frequency) {
        for(int i = 0; i < 26; i++) {
            if(s1Frequency[i] != s2Frequency[i]) {
                return false;
            }
        }
        return true;
    }
}
