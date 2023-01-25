public class SudokuSolver_ColinNeumann implements SudokuSolver {

    /**
     * Solve the puzzle using depth first search
     * @param i : the current row index
     * @param j : the current column index
     * @param cells : the current board configuration
     */
    
    public int[][] solve_dfs(int i, int j, int[][] cells) {
        if (i == 8 && j >= 9) return cells;
        if (j == 9) {
            return solve_dfs(i + 1, 0, cells);
        }
        
        if (cells[i][j] == 0) {
            for (int val = 1; val <= 9; val++) {
                if (check_move(i, j, val, cells)) {
                    cells[i][j] = val;

                    int[][] temp_cells = solve_dfs(i, j + 1, cells);

                    if (temp_cells != null) {
                        return temp_cells;
                    } else if (val == 9) {
                    cells[i][j] = 0;
                    return null;
                }

            } else if (val == 9) {
                cells[i][j] = 0;
                return null;
            }
        }
    }

        return solve_dfs(i, j + 1, cells);

    }

    /**
     * Check whether the current move (putting val at the position [i,j]) is legal
     * @param i: the current row index
     * @param j: the current column index
     * @param val: the current value assignment
     * @param cells: the current board configuration
     * @return true if legal. Otherwise false
     */

    public boolean check_move(int i, int j, int val, int[][] cells) {
        for (int c = 0;  c < 9; c++) {
            if (cells[c][j] == val && c != i) {
                return false;
            }
        }
        for (int d = 0; d < 9; d++) {
            if (cells[i][d] == val && d != j) {
                return false;
            }
        }
        int a = (i/3) * 3;
        int b = (j/3) * 3;
        for (int c = 0; c < 3; c++) {
            for (int d = 0; d < 3; d++) {
                if (a + c != i || b + d != j) {
                    if (cells[a + c][b + d] == val) {
                    return false;
                    }
                }
            }
        }
        return true;

    }


    
}
