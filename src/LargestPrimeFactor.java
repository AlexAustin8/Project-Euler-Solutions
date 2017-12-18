/**
 * @author Alexander Austin
 * 
 * The purpose of this class is to find the Largest Prime Factor of a number input by the user. 
 * This is a solution to a prompt on projecteuler.net which can be found here: https://projecteuler.net/problem=3
 */

import java.util.*;
import java.lang.Math;
public class LargestPrimeFactor {
	
	public static long factor(long n) {	
		long sq = (long)Math.sqrt(n);
		for(long i = sq; i > 0; i--) {
			if(n % i == 0 && isPrime(i)) {
				return i;
			}
		}
		return 0;
	}
	
	public static boolean isPrime(long n) {
		for(long i = n-1; i > 1; i--) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter in a value to factor: ");
		long p = scan.nextLong();
		System.out.println(factor(p));
		scan.close();
		
		
    }
}
