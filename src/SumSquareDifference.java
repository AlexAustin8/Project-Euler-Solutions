/**
 * @author Alexander Austin
 * 
 * The purpose of this class is to find the difference between the sum of squares and square of a sum of a number of natural numbers entered in by user
 * This is a solution to a prompt on projecteuler.net which can be found here: https://projecteuler.net/problem=6
 */
import java.util.*;
public class SumSquareDifference {
	
	public static int sumSquareDifference(int limit) {
		int sum = 0, sumOfSquares = 0, squareOfSum;
		for(int i = 1; i <= limit; i++) {
			sum += i;
			sumOfSquares += (i*i);
		}
		squareOfSum = sum * sum;
		return(squareOfSum - sumOfSquares);
		
	}
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int limit;
		System.out.println("Please type in the number of natural numbers to use: ");
		limit = scan.nextInt();
		System.out.println(sumSquareDifference(limit));
		scan.close();
		
	
	}

}
