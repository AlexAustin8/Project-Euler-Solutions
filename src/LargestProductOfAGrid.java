/**
 * @author Alexander Austin
 * 
 * The purpose of this class is to find the greatest sum of adjacent numbers(up, down, left, right, diagonal) in a grid.
 * This is a solution to a prompt on projecteuler.net which can be found here: https://projecteuler.net/problem=11
 */
public class LargestProductOfAGrid {
	
	public static int findLargestProduct(int[][] grid) {
		int max = 0;
		int product;
		for(int i = 0; i < grid.length; i++) {
			for(int j = 0; j < grid[i].length; j++) {
				if(i+3 < grid.length) {
					product = grid[i][j] * grid[i+1][j] * grid[i+2][j] * grid[i+3][j];
					if(product > max) {
						max = product;
					}
				}
				if(j+3 < grid[i].length) {
					product = grid[i][j] * grid[i][j+1] * grid[i][j+2] * grid[i][j+3];
					if(product > max) {
						max = product;
					}
				}
				
				if(j+3 < grid[i].length && i+3 < grid.length) {
					product = grid[i][j] * grid[i+1][j+1] * grid[i+2][j+2] * grid[i+3][j+3];
					if(product > max) {
						max = product;
					}
				}
				
				if(j-3 >= 0 && i-3 >= 0) {
					product = grid[i][j] * grid[i-1][j-1] * grid[i-2][j-2] * grid[i-3][j-3];
					if(product > max) {
						max = product;
					}
				}
				
				if(j-3 >= 0 && i+3 < grid.length) {
					product = grid[i][j] * grid[i+1][j-1] * grid[i+2][j-2] * grid[i+3][j-3];
					if(product > max) {
						max = product;
					}
				}
				if(j+3 < grid[i].length && i-3 >= 0) {
					product = grid[i][j] * grid[i-1][j+1] * grid[i-2][j+2] * grid[i-3][j+3];
					if(product > max) {
						max = product;
					}
				}
				
			}
		}
		
		return max;
		
	}
	
	public static void main(String [] args) {
		int[][] grid = new int[20][];
		int[] row1 = {8, 2, 22, 97, 38,15,0,40,0,75,4,5,7,78,52,12,50,77,91,8};
		grid[0] = row1;
		int[] row2 = {49,49,99,40,17,81,18,57,60,87,17,40,98,43,69,48,4,56,62,0};
		grid[1] = row2;
		int[] row3 = {8,49,31,73,55,79,14,29,93,71,40,67,53,88,30,3,49,13,36,65};
		grid[2] = row3;
		int[] row4 = {52,70,95,23,4,60,11,42,69,24,68,56,1,32,56,71,37,2,36,91};
		grid[3] = row4;
		int[] row5 = {22,31,16,71,51,67,63,89,41,92,36,54,22,40,40,28,66,33,13,80};
		grid[4] = row5;
		int[] row6 = {24,47,32,60,99,3,45,2,44,75,33,53,78,36,84,20,35,17,12,50};
		grid[5] = row6;
		int[] row7 = {32,98,81,28,64,23,67,10,26,38,40,67,59,54,70,66,18,38,64,70};
		grid[6] = row7;
		int[] row8 = {67,26,20,68,2,62,12,20,95,63,94,39,63,8,40,91,66,49,94,21};
		grid[7] = row8;
		int[] row9 = {24,55,58,5,66,73,99,26,97,17,78,78,96,83,14,88,34,89,63,72};
		grid[8] = row9;
		int[] row10 = {21,36,23,9,75,0,76,44,20,45,35,14,0,61,33,97,34,31,33,95};
		grid[9] = row10;
		int[] row11 = {78,17,53,28,22,75,31,67,15,94,3,80,4,62,16,14,9,53,56,92};
		grid[10] = row11;
		int[] row12 = {16,39,5,42,96,35,31,47,55,58,88,24,0,17,54,24,36,29,85,57};
		grid[11] = row12;
		int[] row13 = {86,56,0,48,35,71,89,7,5,44,44,37,44,60,21,58,51,54,17,58};
		grid[12] = row13;
		int[] row14 = {19,80,81,68,5,94,47,69,28,73,92,13,86,52,17,77,4,89,55,40};
		grid[13] = row14;
		int[] row15 = {4,52,8,83,97,35,99,16,7,97,57,32,16,26,26,79,33,27,98,66};
		grid[14] = row15;
		int[] row16 = {88,36,68,87,57,62,20,72,3,46,33,67,46,55,12,32,63,93,53,69};
		grid[15] = row16;
		int[] row17 = {4,42,16,73,38,25,39,11,24,94,72,18,8,46,29,32,40,62,76,36};
		grid[16] = row17;
		int[] row18 = {20,69,36,41,72,30,23,88,34,62,99,69,82,67,59,85,74,4,36,16};
		grid[17] = row18;
		int[] row19 = {20,73,35,29,78,31,90,1,74,31,49,71,48,86,81,16,23,57,5,54};
		grid[18] = row19;
		int[] row20 = {1,70,54,71,83,51,54,69,16,92,33,48,61,43,52,1,89,19,67,48};
		grid[19] = row20;
		System.out.println(findLargestProduct(grid));
	}

}
