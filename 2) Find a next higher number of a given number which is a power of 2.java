// Find a next higher number of a given number which is a power of 2 (Approach 2)

// Logic -> Right shift the given number until we reach to 0, and then do Left shift that times which we have done right shifts.

public class Main
{
    public static void main(String[] args) 
    {
        
        int number=32;
        int count=0;
        while(number !=0)
        {
            number =number >>1;
            ++count;
        }
        
        number=1;
        while(count !=0)
        {
            number =number <<1;
            --count;
        }
        
        System.out.println(number);
    }
}