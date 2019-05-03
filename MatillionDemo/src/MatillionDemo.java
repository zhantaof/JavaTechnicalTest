/**
 * An arbitrary class for Matillion Java Technical Test 1.
 * @author Zhantao Fang
 *
 */
public class MatillionDemo
{
    // ----------------------------------------------------------------------
    // Public methods
    // ----------------------------------------------------------------------
 
    /**
     * A method to compare two strings and return the 
     * number of differences within the two strings.
     * 
     * @param s1 the first string
     * @param s2 the second string
     * @return the number of differences
     */
    public int test1( String s1, String s2 )
    {
        try
        {   
            if ( s1.isEmpty() || s2.isEmpty() )
                throw new NullPointerException();
            
            if ( s1.length() != s2.length() )
                throw new IllegalArgumentException();
        
            int noOfDifferences = 0;
            for ( int i = 0; i < s1.length(); i++ )
            {
                // if the two characters are not equal
                if ( s1.charAt( i ) != s2.charAt( i ) )
                {
                    // increment counter
                    noOfDifferences++;
                } // if
            } // for
            return noOfDifferences;
        } // try
        catch ( IllegalArgumentException exception )
        {
            System.out.println( "Please supply two arguments with the same length." );
            System.out.println( "Exception message: " + exception.getMessage() );
            System.err.println( exception );
            return -1;  
        } // catch
        catch ( NullPointerException exception )
        {
            System.out.println( "Please supply two arguments that are not null or empty." );
            System.out.println( "Exception message: " + exception.getMessage() );
            System.err.println( exception );
            return -1;
        } // catch
        catch ( Exception exception )
        {
            System.out.println( "Unexpected error." );
            System.out.println( "Exception message: " + exception.getMessage() );
            System.err.println( exception );
            return -1;
        } // catch
    } // test1
 
    // ----------------------------------------------------------------------
    // Protected methods
    // ----------------------------------------------------------------------
 
    // ----------------------------------------------------------------------
    // Private methods
    // ----------------------------------------------------------------------
 
    // ----------------------------------------------------------------------
    // Static methods
    // ----------------------------------------------------------------------
    
    public static void main( String[] args )
    {
        System.out.println( "Hello, World!" );
        
        // create new class object
        MatillionDemo tester = new MatillionDemo();
        
        // call a method of the object
        int noOfDifferences = tester.test1( "hello", "herro" );
        
        // print the output
        if ( noOfDifferences != -1 )
            System.out.println( "Number of Differences: " + noOfDifferences );
        else
            System.out.println( "Return Value: " + noOfDifferences );
        
    } // main
} // MatillionDemo