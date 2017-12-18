/**
 * @author Alexander Austin
 * 
 * The purpose of this program is to find the sum of all multiples of 3 and 5 that are less than 1000
 * This is a solution to a prompt on projecteuler.net which can be found here: https://projecteuler.net/problem=1
 */

public class MultiplesOfThreeAndFive {
	
	public static int calcThreeFiveMult(){
	    int tot = 0;
	    for(int i = 0; i < 1000; i++){
	    	if(i % 5 == 0 || i % 3 == 0){
			   tot += i;
		}
	}
	    return tot;
	
   }
	
	public static void main(String[] args){
		int multSum = calcThreeFiveMult();
		System.out.println(multSum);
	}
	
	
	

}
