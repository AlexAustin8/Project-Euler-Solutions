/**
 * @author Alexander Austin
 * 
 * The purpose of this class is to find the largest palindrome product of two three digit numbers 
 * This is a solution to a prompt on projecteuler.net which can be found here: https://projecteuler.net/problem=4
 */

public class LargestPalindromeProduct {
	
	public static int largestPalindromeProduct() {
		int largest = 0;
		int product, head, tail;
		boolean palindrome;
		String productString;
		for(int i = 100; i < 1000; i++) {
			for(int k = 100; k < 1000; k++) {
				product = i*k;
				productString = String.valueOf(product);
				palindrome = true;
				tail = productString.length()-1;
				head = 0;
				while(palindrome && tail > head) {
					if(productString.charAt(head) != productString.charAt(tail)) {
						palindrome  = false;
					}
					tail--;
					head++;
				}
				if(palindrome && product > largest) {
					largest = product;
				}
				
				
			}
		}
		
		return largest;
	}

	
	public static void main(String args[]) {
		System.out.println(largestPalindromeProduct());
	}
}
