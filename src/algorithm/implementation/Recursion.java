package algorithm.implementation;

public class Recursion {

	public Recursion() {
		// TODO Auto-generated constructor stub
	}

	protected long sumOfNumbers(long accumulator, long n) {
		//Base condition
		if(n == 0)	return accumulator;
		
		//Recursive call for sum
		return sumOfNumbers(accumulator+n, n-1);
	}
	
	/**
	 * Calculate factorial of the number
	 * @param accumulator
	 * @param number
	 * @return factorial value
	 */
	protected long factorial(long accumulator, long number) {
		//Base condition
		if(number == 1)	return accumulator;
		
		//Recursive call for factorial
		return factorial(accumulator*number, number-1);
	}
	
	/**
	 * Euclidean algorithm to find greatest common division
	 * @param firstNumber
	 * @param secondNumber
	 * @return gcd
	 */
	public long gcdByEuclidean(long firstNumber, long secondNumber) {
		if(secondNumber == 0) return firstNumber;
		
		return gcdByEuclidean(secondNumber, firstNumber % secondNumber);
	}
}
