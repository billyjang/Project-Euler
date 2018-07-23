class Problem4 {
    public static void main(String[] args) {
        int[][] grid = new int[200][200];
        initializeGrid(grid);
        System.out.println(grid[199][199]);

        boolean noPalindrome = true;
        /*
        while (noPalindrome) {
            if(isPalindrome(grid[i][j])) {
                System.out.println(grid[i][j]);
            }
            if(Math.abs(i - j) > 0) {
                i = i - 1;
            } else {
                j = j - 1;
            }
        }
        */
        for(int i = 0; i < 199; i ++) {
            for(int j = 0; j < 199; j++) {
                if(isPalindrome(grid[i][j])) {
                    System.out.println(grid[i][j]);
                }
            }
        }
    }

    private static void initializeGrid(int[][] grid) {
        if(grid.length != 200 || grid[0].length != 200) {
            System.exit(-1);
        }
        int i_ind, j_ind = 0;
        for(int i = 800; i <  999; i ++) {
            for(int j = 800; j < 999; j++) {
                i_ind = i - 800;
                j_ind = j - 800;
                grid[i_ind][j_ind] = i*j;
            }
        }
    }

    private static int manhattan(int i, int j) {
        return Math.abs(200 - i) + Math.abs(200 - j);
    }

    private static boolean isPalindrome(int n) {
        int first_half = n / 1000;
        int second_half = reverse(n % 1000);
        return first_half - second_half == 0;

    }

    private static int reverse(int n) {
        return (((n % 10)*100) + (((n / 10) % 10) * 10) + (n / 100));
    }
}