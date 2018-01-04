import java.util.*;
import java.io.*;
import java.math.BigInteger;
public class LargeSum {
/**
 * @author Alexander Austin
 * 
 * The purpose of find the first 10 digits of a massive sum read line by line from a file called "Numbers.txt"
 * More specifically, the prompt dictates that this program must find the first 10 digits of a sum of 100 50 digit numbers.
 * This is a solution to a prompt on projecteuler.net which can be found here: https://projecteuler.net/problem=13
 */
	public static String findSum(List<BigInteger> numbers) {
		BigInteger sum = new BigInteger("0");
		for(BigInteger num : numbers) {
			sum = sum.add(num);
		}
		String sumString = sum.toString();
		return(sumString.substring(0,10));
		
	}
	
	public static void main(String[] args) {
		try {
			List<BigInteger> nums = new ArrayList<BigInteger>();
			File numInput = new File("Numbers.txt");
			Scanner scan = new Scanner(numInput);
			while(scan.hasNextBigInteger()) {
				nums.add(scan.nextBigInteger());
		}
			scan.close();
		    System.out.println(findSum(nums));
	}catch(Exception e) {
		System.out.println(e.getMessage());
	}
	}

	
	
}
