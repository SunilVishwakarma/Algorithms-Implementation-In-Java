/**
 * 
 */
package algorithm.tester;

import algorithm.implementation.Recursion;
import algorithm.implementation.RecursionAdapter;

/**
 * @author svishwakarma
 *
 */
public class TestRecursion {

	/**
	 * 
	 */
	public TestRecursion() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		RecursionAdapter rec = new RecursionAdapter();
		
		//Printing sum of numbers between 1 to n 
		System.out.println(rec.calculateSumOfNumbers(5));
		
		System.out.println("===");
		
		//Printing factorial of number n
		System.out.println(rec.calculateFactorial(5));
	}

}
