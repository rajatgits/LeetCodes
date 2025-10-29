class Solution {
    public String reverseWords(String s) {
        String[] str = s.strip().replaceAll("\\s{2,}", " ").split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = str.length - 1; i >= 0; i--) {
            sb.append(str[i]);
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}
