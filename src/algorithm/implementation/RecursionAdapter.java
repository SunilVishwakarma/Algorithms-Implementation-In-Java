package algorithm.implementation;

public class RecursionAdapter extends Recursion {

	public RecursionAdapter() {
		// TODO Auto-generated constructor stub
	}
	
	public long calculateSumOfNumbers(long n) {
		
		long result = 0;
		
		return sumOfNumbers(result, n);
	}
	
	public long calculateFactorial(long n) {
		long result = 1;
		
		return factorial(result, n);
	}
	
}
