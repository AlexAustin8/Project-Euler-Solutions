
/**
 * @author Alexander Austin
 * 
 * The purpose of this class is to find the Largest Prime Factor of a number input by the user. 
 * This is a solution to a prompt on projecteuler.net which can be found here: https://projecteuler.net/problem=16
 */
using System;
using System.Numerics;

namespace ProjectEuler
{
	class PowerDigitSum
	{
        //This method accepts as a parameter, a number to be applied as an exponent to two, 
        //and subsequently returns a sum of the digits of that number a long value type.
        //BigInteger and longs are used to allow for calculation of massive numbers.
		public static long getPowerDigitSum(int power)
		{
			BigInteger start = new BigInteger(2);
			start = BigInteger.Pow(start, power);
			string result = start.ToString();
			long sum = 0;

			foreach(char d in result){
				sum += (long)Char.GetNumericValue(d);
			}


			return sum;

		}

		static void Main(){
			Console.WriteLine("Enter in an Exponent to apply to 2: ");
			int pow = Convert.ToInt32((Console.ReadLine()));
			long res = getPowerDigitSum(pow);
			Console.WriteLine("The Sum of the digits of 2 to the " + pow + " power is: " + res);


		}

	}
}