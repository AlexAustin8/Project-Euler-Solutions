import java.util.Scanner;

/**
 * @author Alexander Austin
 * 
 * The purpose of this class is to find the sum of all prime numbers below a limit specified by the user.
 * This is a solution to a prompt on projecteuler.net which can be found here: https://projecteuler.net/problem=10
 */
public class SummationOfPrimes {
	
	public static long summationOfPrimes(long limit) {
		long sum;
		
		if(limit <= 2) {
			return 0;
		}
		sum = 2;
		for(int i = 3; i< limit; i+=2) {
			if (isPrime(i)) {
				sum+=i;
			}
		}
		
		return sum;
	}
	
	public static boolean isPrime(long n) {
		for(int i = 2; i <= Math.sqrt(n); i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int limit;
		
		System.out.println("Please enter in a limit to find the prime summation up to: ");
		limit = scan.nextInt();
		System.out.println(summationOfPrimes(limit));
		scan.close();

		
	}
	
	
	

}
