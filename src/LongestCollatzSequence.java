import java.util.*;
/**
 * @author Alexander Austin
 * 
 * The purpose of this class is to find what starting number under a limit specified by the user produces the longest collatz sequence
 * This is a solution to a prompt on projecteuler.net which can be found here: https://projecteuler.net/problem=14
 */
public class LongestCollatzSequence {
	
	public static int findLongestSequence(int limit) {
		long maxLength = 0;
		int largestStartingNum = 0;
		long sequenceLength, num;
		for(int i = 2; i < limit; i++) {
			sequenceLength = 0;
			num = i;
			while(num != 1) {
				if(num % 2 == 0) {
					sequenceLength++;
					num = num/2;
				}else {
					sequenceLength++;
					num = (3*num) +1;
				}
			}
			if(sequenceLength > maxLength) {
				maxLength = sequenceLength;
				largestStartingNum = i;
			}
		}
		return largestStartingNum;
	}
	
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int limit;
		System.out.println("Please enter in an upper limit for searches for the longest collatz sequence");
		limit = scan.nextInt();
		System.out.println(findLongestSequence(limit));
	}

}
