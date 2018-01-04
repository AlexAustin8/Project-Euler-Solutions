import java.util.*;
/**
 * @author Alexander Austin
 * 
 * The purpose of this class to find the first triangular number with a number of divisors specified by the user.
 * This is a solution to a prompt on projecteuler.net which can be found here: https://projecteuler.net/problem=12
 */
public class DivisibleTriangularNumbers {
	
	public static long findTriangularNumber(int numDivisors) {
		long triangularNum = 0;
		boolean sufficientDivisors = false;
		for(int i = 1; !sufficientDivisors; i++){
			triangularNum += i;
			sufficientDivisors = hasEnoughDivisors(triangularNum, numDivisors);
	     }
		return triangularNum;
	}
	
	public static boolean hasEnoughDivisors(long num, int divisors) {
		int divCount = 0;
		for(int i = 1; i<=Math.sqrt(num); i++) {
			if(num % i == 0) {
				divCount+=2;
			}
		}
		return (divCount >= divisors);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		System.out.println("How many divisors in the triangular number?");
		num = scan.nextInt();
		System.out.println(findTriangularNumber(num));
	}

}
