// Toggle kth bit of number

// Logic -> ( n ^ (1<<k) )

public class Main
{
	public static void main(String[] args) {
		
		int n=75;
		int k=3;
		
		toggle(n,k);
	}
	
	static void toggle(int n, int k)
	{
	    System.out.println( n ^ (1<<k) );
	}
		
}