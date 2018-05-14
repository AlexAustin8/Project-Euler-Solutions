
/**
 * @author Alexander Austin
 * 
 * The purpose of this class is to count the letters in continuous spelled out numbers 
 * This is a solution to a prompt on projecteuler.net which can be found here: https://projecteuler.net/problem=17
 */
using System;

namespace ProjectEuler
{
	class NumberLetterCounts
	{


		static string getStringRep(char c)
		{
			switch(c)
			{
				case '0':
					return "zero";
					break;
				case '1':
					return "one";
					break;
				case '2':
					return "two";
					break;
				case '3':
					return "three";
					break;
				case '4':
					return "four";
					break;
				case '5':
					return "five";
					break;
				case '6':
					return "six";
					break;
				case '7':
					return "seven";
					break;
				case '8':
					return "eight";
					break;
				case '9':
					return "nine";
					break;
			}
			return "";

		}


		static string getTwoDigitStringRep(char[] arr)
		{
			switch(arr[0])
			{
				case'1':
					switch(arr[1])
					{
						case '0':
							return "ten";
							break;
						case '1':
							return  "eleven";
							break;
						case '2':
							return  "twelve";
							break;
						case '3':
							return  "thirteen";
							break;
						case '5':
							return  "fifteen";
							break;
						case '8':
							return  "eighteen";
							break;
						default:
							return getStringRep(arr[1]) + "teen";
							break;
					}
				case '2':
				    if(arr[1] == '0'){
				    	return "twenty";
				    }
					return ("twenty" + getStringRep(arr[1]));
					break;
				case '3':
				    if(arr[1] == '0'){
				    	return "thirty";
				    }
					return ("thirty" + getStringRep(arr[1]));
					break;
				case '4':
				    if(arr[1] == '0'){
				    	return "forty";
				    }
					return ("forty" + getStringRep(arr[1]));
					break;
				case '5':
				    if(arr[1] == '0'){
				    	return "fifty";
				    }
					return ("fifty" + getStringRep(arr[1]));
					break;
				case '6':
				    if(arr[1] == '0'){
				    	return "sixty";
				    }
					return ("sixty" + getStringRep(arr[1]));
					break;
				case '7':
				    if(arr[1] == '0'){
				    	return "seventy";
				    }
					return ("seventy" + getStringRep(arr[1]));
					break;
				case '8':
				    if(arr[1] == '0'){
				    	return "eighty";
				    }
					return ("eighty" + getStringRep(arr[1]));
					break;
				case '9':
				    if(arr[1] == '0'){
				    	return "ninety";
				    }
					return ("ninety" + getStringRep(arr[1]));
					break;
			}
			return "";
		}


		static string getThreeDigitStringRep(char[] arr)
		{
			if(arr[1] == '0'){
				if(arr[2] != '0'){
				 return (getStringRep(arr[0]) + "hundredand" + getStringRep(arr[2]));
				}else{
				 return(getStringRep(arr[0]) + "hundred");
				}
			}else{
			char[] trimArr = new char[]{arr[1], arr[2]};
			return (getStringRep(arr[0]) + "hundredand" + getTwoDigitStringRep(trimArr));
		  }
		}

		static string getFourDigitStringRep(char[] arr)
		{

			if(arr[3] == '0' && arr[2] == '0' && arr[1] == '0'){
				return (getStringRep(arr[0]) + "thousand");
			}
			char[] trimArr = new char[]{arr[1], arr[2], arr[3]};

			return (getStringRep(arr[0]) + "thousandand" + getThreeDigitStringRep(trimArr));
		}



		public static int LetterCount(int num)
		{
			char[] splitnum = num.ToString().ToCharArray();
			string numString = "";
			if(splitnum.Length == 1){
				numString =  getStringRep(splitnum[0]);
			}else if(splitnum.Length == 2){
				numString = getTwoDigitStringRep(splitnum);
			}else if(splitnum.Length == 3){
				numString = getThreeDigitStringRep(splitnum);
			}else if(splitnum.Length == 4){
				numString = getFourDigitStringRep(splitnum);
             }
            Console.WriteLine(numString + numString.Length);
			return numString.Length;
			}
			


		static void Main(){
			Console.WriteLine("Enter in a four digit number");
		    int num = Convert.ToInt32((Console.ReadLine()));
		    int res = 0;
		    for(int i = 1; i<=num; i++){
		    	res += LetterCount(i);
		    }
		    Console.WriteLine("If you were to spell out every number from 1 to " + num + " it would contain "  + res + " letters");



		}




	}
}
