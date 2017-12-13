
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
