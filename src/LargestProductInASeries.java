import java.util.*;

/**
 * @author Alexander Austin
 * 
 * The purpose of this class is to find the largest product of a specified number of adjacent numbers in a series.
 * This is a solution to a prompt on projecteuler.net which can be found here: https://projecteuler.net/problem=8
 */

public class LargestProductInASeries {
	
	public static long findLargestProduct(int numAdjacents,String series) {
		int head = 0;
		long max = 0;
		
		for(int tail = numAdjacents; tail<series.length(); tail++) {
			long product = 1;
			for(int k = head; k < tail; k++) {
				product *= Character.getNumericValue(series.charAt(k));
			}
			if(product > max) {
				max = product;
			}
			head++;
			
		}
		return max;
	}
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		String series;
		int numAdjacents;
		System.out.println("Please enter in the series you would like to use:  ");
		series = scan.next();
		System.out.println("How many adjacent numbers would you like to find the product of? :  ");
		numAdjacents = scan.nextInt();
		System.out.println(findLargestProduct(numAdjacents, series));
		scan.close();
		
	}

}
