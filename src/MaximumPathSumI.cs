/**
 * @author Alexander Austin
 * 
 * The purpose of this class is to count the maximum path given a triangle of numbers 
 * This is a solution to a prompt on projecteuler.net which can be found here: https://projecteuler.net/problem=18
 */
using System;
using System.IO;
using System.Threading.Tasks;
using System.Collections.Generic;

namespace ProjectEuler
{
	class MaximumPathsum
	{
        //Parse the text file into a List<List<int>> object and return
        static async Task<List<List<int>>> ParseFile(string filename){
        	string line;
            List<List<int>> levels = new List<List<int>>();
            StreamReader file = new StreamReader(filename);

            
            while((line = file.ReadLine()) != null)  
			{  
 			     String[] strArr = line.Split(' ');
 			     List<int> intArr = new List<int>();
 			     foreach(string s in strArr){
 			     	intArr.Add(Convert.ToInt32(s));
 			     }
 			     levels.Add(intArr);
			}
			return levels;  


        }

        //Recursivley finds the maximum path through the data
        static int maxPath(List<List<int>> data, int currLevel, int index){
        	if (currLevel >= (data.Count -1)){
                return data[currLevel][index];
        	}else{
        		int curr = data[currLevel][index];
        		currLevel++;
        		int res =  Math.Max(maxPath(data, currLevel, index), maxPath(data, currLevel, ++index));
        		return curr + res;
        	}
        }


		static async Task<int> CalcMaximumPath(string filename)
		{
            List<List<int>> data = await ParseFile(filename);
            int res = maxPath(data, 0, 0);
			return res;
		}


        //Note: To calculate using the data from the problem, use "PathSumInput.txt", which
        //is Contained in this repository.
		static void Main(){
			Console.WriteLine("Enter in a file from which to read data");
			string filename = Console.ReadLine();
			var res = CalcMaximumPath(filename);
			Console.WriteLine("The maximum path through the given data is: " + res.Result);
		}
	}

}
