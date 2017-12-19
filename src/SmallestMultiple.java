/**
 * @author Alexander Austin
 * 
 * The purpose of this class is to find the smallest number that can be divided by numbers 1 up to number input by user without any remainder
 * This is a solution to a prompt on projecteuler.net which can be found here: https://projecteuler.net/problem=5
 */
import java.util.*;
public class SmallestMultiple {
	
	public static int findSmallestMultiple(int limit){
		boolean found;
		for(int i = limit; i< 2147483647; i = i+limit) {
			found = true;
			for(int k = 1; k<limit; k++) {
				if(i % k != 0) {
					found = false;
				}
			}
			if(found) {
				return i;
			}
		
		}
		return 0;
	}
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter in a multiple limit: ");
		int limit = scan.nextInt();
		System.out.println(findSmallestMultiple(limit));
	}
	

}
