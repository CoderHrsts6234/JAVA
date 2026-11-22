package OOPF3;

public class MCP {

	public static void main(String[] args) {
		int[][] matrix = { {1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
		
		int minCost = findMindCost(matrix);
		
		System.out.println("Min cost to traverse the grid: " + minCost);

	}

	private static int findMindCost(int[][] matrix) {
		
		int rows = matrix.length;
		int cols = matrix[0].length;
		
		int[][] tm = new int[rows][cols];
		
		tm[0][0] = matrix[0][0];
		
		for(int i = 1; i < rows; i++) {
			tm[i][0] = tm[i - 1][0] + matrix[i][0];
		}
		
		for(int j = 1; j < cols; j++) {
			tm[0][j] = tm[0][j - 1] + matrix[0][j];
		}
		
		for(int i = 1; i < rows; i++) {
			for(int j = 1; j < cols; j++) {
				tm[i][j] = matrix[i][j] + Math.min(tm[i-1][j], tm[i][j-1]);
			}
		}
		return tm[rows - 1][cols - 1];
	}
	
	

}
