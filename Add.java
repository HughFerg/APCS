package Recursion;

public class Add {
	public static void main(String[] args) {
		System.out.println(addAll(100));
		System.out.println(fib(12)); 
	}

	public static int addAll(int n) {

		if (n == 1) {
			return 1;
		} else {
			return n + addAll(n - 1);
		}
	}

	public static int fib( int n )
	{ 
	  if ( n == 1 ) 
	    return 1; 
	  else if ( n == 2 ) 
	    return 1; 
	  else 
	    return fib( n-1 ) + fib( n-2 ); 
	}
}
