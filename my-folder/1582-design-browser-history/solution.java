class BrowserHistory {

    public class Node {
        String url;
        Node back;
        Node forward;

        public Node(String url) {
            this.url = url;
            back = null;
            forward = null;
        }
    }

    Node curr;
    public BrowserHistory(String homepage) {
        curr = new Node(homepage);
    }
    
    public void visit(String url) {
        Node nextPage = new Node(url);
        curr.forward = nextPage;
        nextPage.back = curr;
        curr = nextPage;
    }
    
    public String back(int steps) {
        while(curr.back != null && steps-- > 0) {
            curr = curr.back;
        }
        return curr.url;
    }
    
    public String forward(int steps) {
        while(curr.forward != null && steps-- > 0) {
            curr = curr.forward;
        }
        return curr.url;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */
