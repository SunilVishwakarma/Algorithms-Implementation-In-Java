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
	
	protected long factorial(long accumulator, long n) {
		//Base condition
		if(n == 1)	return accumulator;
		
		//Recursive call for factorial
		return factorial(accumulator*n, n-1);
	}
}
