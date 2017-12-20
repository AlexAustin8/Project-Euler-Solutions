import java.util.Scanner;

/**
 * @author Alexander Austin
 * 
 * The purpose of this class is to find the prime number specified by the user (ex. a user input of 10 will result in finding the 10th prime)
 * This is a solution to a prompt on projecteuler.net which can be found here: https://projecteuler.net/problem=7
 */
public class CountingPrimes {
	
	public static int findPrime(int n) {
		int currNum = 1;
		int primeCount = 0;
		while(primeCount < n) {
			currNum++;
			if(isPrime(currNum)) {
				primeCount++;
			}
			
		}
		return currNum;
	}
	
	public static boolean isPrime(int n) {
		for(int i = n-1; i > 1; i--) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int numberPrime;
		System.out.println("Which Number Prime would you like to find?");
		numberPrime = scan.nextInt();
		System.out.println(findPrime(numberPrime));
	}

}
