// Set the K-th bit of a given number

public class Main
{
	public static void main(String[] args) {
		
		int n=10;
		int k=3; //assuming k is of 0 indexing from right to left
		
		set(n,k);
	}
	
	static void set(int n, int k)
	{
	    System.out.println(n | 1<< k-1 ); 
	}
	
}