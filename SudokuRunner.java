
public class SudokuRunner {

    public static void main(String[] args) {

        int[][] matrix;

        SudokuSolver test_ps = new SudokuSolver_ColinNeumann();

        matrix = SudokuUtil.load_problem("/Users/Kitchen/Desktop/IndividualProject1/Test_Problem_Simple.txt");
        SudokuUtil.write_matrix(matrix);
        int[][] sol= test_ps.solve_dfs(0, 0, matrix);
        SudokuUtil.write_matrix(sol);
        if (SudokuUtil.check_solution (sol))
            System.out.println("You pass the first test! Congratulations!");
        else
            System.out.println("Sorry, your solution is incorrect!");
    }

}
