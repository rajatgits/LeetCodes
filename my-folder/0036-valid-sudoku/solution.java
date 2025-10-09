class Solution {
    public boolean isValidSudoku(char[][] board) {
        int N = 9;

        Set<Character>[] rows = new HashSet[N];
        Set<Character>[] cols = new HashSet[N];
        Set<Character>[] boxes = new HashSet[N];

        for(int i = 0; i < N; i++) {
            rows[i] = new HashSet<Character>();
            cols[i] = new HashSet<Character>();
            boxes[i] = new HashSet<Character>();
        }

        for(int row = 0; row < N; row++) {
            for(int col = 0; col < N; col++) {
                char val = board[row][col];

                if(val == '.') {
                    continue;
                }

                if(rows[row].contains(val)) {
                    return false;
                }
                rows[row].add(val);

                if(cols[col].contains(val)) {
                    return false;
                }
                cols[col].add(val);

                int index = (row/3)*3 + col/3;
                if(boxes[index].contains(val)) {
                    return false;
                }
                boxes[index].add(val);
            }
        }
        return true;
    }
}
