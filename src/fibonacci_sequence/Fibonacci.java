package fibonacci_sequence;

public class Fibonacci {

	
	/* A Fibonacci sequence is an ordering of numbers where each number is the sum of the preceding two.
	 * For example, the first ten numbers of the Fibonacci sequence are: 0,1,1,2,3,5,8,13,21,34.
	 * 
	 * The Fibonacci challenge usually goes something like this: write a function that return the nth entry 
	 * in the Fibonacci sequence, where n is a number you pass in as argument to the function.
	 */
	
	static int fibonacci(int n) {
		//Declare an array to store Fibonacci numbers.
		int fibonacci[] = new int[n+2]; // 1 extra to handle case, n=0
		int i;
		
		// 0th and 1st number of the series are 0 and 1.
		fibonacci[0] = 0;
		fibonacci[1] = 1;
		
		for(i=2; i<=n; i++) {
			//Add the previous 2 numbers in the series and store it.
			fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
			
		}
		
		return fibonacci[n];
	}
	
	
	
	
	public static void main(String[] args) {

		System.out.println(fibonacci(5));
	}

	
	
}
