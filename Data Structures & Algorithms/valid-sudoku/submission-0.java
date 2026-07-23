class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] rows = new HashSet[9];
        HashSet<Character>[] columns = new HashSet[9];
        HashSet<Character>[] boxes = new HashSet[9];
        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            columns[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char c = board[i][j];
                if (board[i][j] == '.')
                    continue;
                if (rows[i].contains(c)) {
                    return false;
                }
                rows[i].add(c);
                if (columns[j].contains(c)) {
                    return false;
                }
                columns[j].add(c);

                int key = (i / 3) * 3 + (j / 3);
                if (boxes[key].contains(c)) {
                    return false;
                }
                boxes[key].add(c);
            }
        }

        return true; 
    }
}
