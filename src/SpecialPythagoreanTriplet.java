import java.util.Scanner;

/**
 * @author Alexander Austin
 * 
 * The purpose of this class is to find the product pythagorean triplet with a sum specified by the user, if it exists. Returns 0 if otherwise
 * This is a solution to a prompt on projecteuler.net which can be found here: https://projecteuler.net/problem=9
 */
public class SpecialPythagoreanTriplet {
	
	public static int findPythagoreanTriplet(int n) {
		for(int i = 1; i < n; i++) {
			for(int k = 1; k+i<n; k++) {
				for(int j = 1; j+k+i<=n; j++) {
					if(i+j+k == n && ((i*i) + (j*j) == k*k || (k*k) + (j*j) == i*i || (i*i) + (k*k) == j*j)){
						return(i*j*k);
					}
				}
			}
		}
		
		return 0;
	}

	
	public static void main (String[] args) {
		int sum;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter in the sum of the pythagorean triplet you would like to find: ");
		sum = scan.nextInt();
		System.out.println(findPythagoreanTriplet(sum));
		scan.close();
	}
}
