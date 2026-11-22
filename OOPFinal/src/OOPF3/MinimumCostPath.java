package OOPF3;

public class MinimumCostPath {

	public static void main(String[] args) {
		
		int[][] grid = { {1, 3, 1}, {1, 5, 1}, {4, 2, 1}
		};
		
		int minCost = findMinCost(grid);
		
		System.out.println("Min cost to traverse the grid: " + minCost);
		
	}
	
	public static int findMinCost(int[][] grid) {
		int rows = grid.length; //Grid içerisinde kaç eleman var
		int cols = grid[0].length; //Grid'in ilk elemanında kaç eleman var
		
		int[][] dp = new int[rows][cols];
		
		dp[0][0] = grid[0][0]; //starting from top-left
		
		for(int i = 1; i < rows; i++) {
			dp[i][0] = dp[i - 1][0] + grid[i][0];
		}
		
		for(int j = 1; j < cols; j++) {
			dp[0][j] = dp[0][j - 1] + grid[0][j];
		}
		
		for(int i = 1; i < rows; i++) {
			for(int j = 1; j < cols; j++) {
				dp[i][j] = grid[i][j] + Math.min(dp[i-1][j],dp[i][j-1]);
			}
		}
		
		return dp[rows-1][cols-1];
	}

}
