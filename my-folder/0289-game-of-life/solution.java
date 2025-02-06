class Solution {
    public void gameOfLife(int[][] board) {
        if(board == null || board.length == 0) {
            return;
        }

        int a = board.length;
        int b = board[0].length;

        for(int i = 0; i < a; i++) {
            for(int j = 0; j < b; j++) {
                int livesCount = live(board, a, b, i, j);

                if(board[i][j] == 1 && livesCount >= 2 && livesCount <= 3) {
                    board[i][j] = 3;
                }
                
                if(board[i][j] == 0 && livesCount == 3) {
                    board[i][j] = 2;
                }
            }   
        }
        
        for(int i = 0; i < a; i++) {
            for(int j = 0; j < b; j++) {
                board[i][j] >>= 1;
            }
        }
    }

    private int live(int[][] board, int a, int b, int i, int j) {
        int liveCount = 0;
        for(int x = Math.max(i - 1, 0); x <= Math.min(i + 1, a - 1); x++) {
            for(int y = Math.max(j - 1, 0); y <= Math.min(j + 1, b - 1); y++) {
                liveCount += board[x][y] & 1;
            }
        }
        liveCount -= board[i][j] & 1;
        return liveCount;
    }
} 
