class Solution {
    public String reverseWords(String s) {
        String[] arr = s.strip().replaceAll("\\s{2,}", " ").split(" ");
        StringBuilder ans = new StringBuilder();

        for(int i = 0; i < arr.length/2; i++) {
            String temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;  
        }
        
        for(int i = 0; i < arr.length-1; i++) {
            ans.append(arr[i]+" ");
        }
        ans.append(arr[arr.length - 1]);

        return ans.toString();
    }
}
