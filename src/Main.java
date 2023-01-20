public class Main {
    public static void main(String[] args) {
        int[][] board1 = {
                {0, 0, 0, 1},
                {1, 1, 1, 0},
                {1, 1, 0, 0},
                {0, 0, 0, 0}
        };
        System.out.println(Solution.boardGame(board1, "RRDLLD"));

        int[][] board2 = new int[][]{
                {0, 0, 1},
                {1, 1, 1},
                {1, 0, 0}
        };
        System.out.println(Solution.boardGame(board2,"UUUDD"));
    }
}