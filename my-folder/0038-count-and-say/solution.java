class Solution {
    public String countAndSay(int n) {
        String str = "1";
        for(int i = 1; i < n; i++) {
            str = count(str);
        }
        return str;
    }

    private String count(String str) {
        StringBuilder sbuilder = new StringBuilder();
        char character = str.charAt(0);
        int count = 1;

        for(int i = 1; i < str.length(); i++) {
            if(str.charAt(i) == character)  {
                count++;
            } else {
                sbuilder.append(count);
                sbuilder.append(character);
                character = str.charAt(i);
                count = 1;
            }
        }
        sbuilder.append(count);
        sbuilder.append(character);
        return sbuilder.toString();
    }
}
