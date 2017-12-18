/**
 * @author Alexander Austin
 * 
 * The purpose of this class is to find the Largest Prime Factor of a number input by the user. 
 * This is a solution to a prompt on projecteuler.net which can be found here: https://projecteuler.net/problem=2
 */

public class EvenFibonacciNumbers {
	
	public static int evenFibSum(){
		//sum is initialized at 2 because temp is never set to 2
		//but it is the first value to be added to the sum.
		int sum = 2;
		int first = 1;
		int second = 2;
		int temp = 0;
		while(second <= 4000000){
			temp = first + second;
			if(temp % 2 == 0){
				sum += temp;
			}
			first = second;
			second = temp;
			
		}
		return sum;
		
	}
	
	public static void main(String args[]){
		int answer = evenFibSum();
		System.out.println(answer);
	}

}
