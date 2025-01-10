class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();

        for(String currPath : path.split("/")) {
            if(currPath.equals("..")) {
                if(!stack.isEmpty()) {
                    stack.pop();
                }
            } else if(currPath.length() > 0 && !currPath.equals(".")) {
                stack.push(currPath);
            }
        }
        return "/" + String.join("/", stack);
    }
}
