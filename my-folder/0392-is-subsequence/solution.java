class Solution {
    public boolean isSubsequence(String s, String t) {
      char[] sArray = s.toCharArray();
      char[] tArray = t.toCharArray();
      int sIndex = 0;
      int tIndex = 0;
      if(s.length() > t.length()) {
        return false;
      }
        if(s.length() < 1) {
            return true;
        }

      while(tIndex < t.length()) {
        if(sArray[sIndex] == tArray[tIndex]) {
            sIndex++;
        }

        if(sIndex == s.length()) {
            return true;
        }
        tIndex++;
      }
      return false;
    }
}
