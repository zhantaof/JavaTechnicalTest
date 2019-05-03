/**
 * An arbitrary JUnit test class for Matillion Java Technical Test 1.
 * @author Zhantao Fang
 *
 */
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MatillionDemoTest
{

    @Test
    void testMatillionDemo()
    {
        MatillionDemo tester = new MatillionDemo();
        
        // asserts statements
        assertEquals( 0, tester.test1( "hello", "hello" ), "Must be equal to 0" );
        assertEquals( 1, tester.test1( "hello", "bello" ), "Must be equal to 1" );
        assertEquals( 2, tester.test1( "hello", "herro" ), "Must be equal to 2" );
        assertEquals( 2, tester.test1( "hallo", "bello" ), "Must be equal to 2" );
        assertEquals( 2, tester.test1( "hollo", "hella" ), "Must be equal to 2" );
        assertEquals( 1, tester.test1( "h", "b" ), "Must be equal to 1" );
        assertEquals( 1, tester.test1( "hello", "hella" ), "Must be equal to 1" );
        assertEquals( 1, tester.test1( "hello there", "bello there" ), "Must be equal to 1" );
        assertEquals( 1, tester.test1( "hello there", "hello theee" ), "Must be equal to 1" );
        assertEquals( 1, tester.test1( "hello", "Hello" ), "Must be equal to 1" );
        assertEquals( 2, tester.test1( "hello there", "hello their" ), "Must be equal to 2" );
        assertEquals( 1, tester.test1( "hello.", "hello!" ), "Must be equal to 1" );
        assertEquals( 1, tester.test1( "hello", "hell0" ), "Must be equal to 1" );
        assertEquals( 5, tester.test1( "hello", "byeee" ), "Must be equal to 5" );
        assertEquals( 5, tester.test1( "hello", "HELLO" ), "Must be equal to 5" );
        assertEquals( 5, tester.test1( "12345", "67890" ), "Must be equal to 5" );
        assertEquals( 0, tester.test1( "hello", "hello" ), "Must be equal to 0" );
        assertEquals( 0, tester.test1( "hellothere!thisisaverylongsentence", "hellothere!thisisaverylongsentence" ), "Must be equal to 0" );
        assertEquals( 0, tester.test1( "Hi! This is a long sentence with spaces!", "Hi! This is a long sentence with spaces!" ), "Must be equal to 0" );
        assertEquals( 0, tester.test1( " ", " " ), "Must be equal to 0" );
        
        assertEquals( -1, tester.test1( "", "" ), "Must be equal to -1" );
        assertEquals( -1, tester.test1( "", " " ), "Must be equal to -1" );
        assertEquals( -1, tester.test1( null, " " ), "Must be equal to -1" );
        assertEquals( -1, tester.test1( " ", null ), "Must be equal to -1" );
        assertEquals( -1, tester.test1( null, null ), "Must be equal to -1" );
        assertEquals( -1, tester.test1( "hi", "hello" ), "Must be equal to -1" );
        assertEquals( -1, tester.test1( "hello", "hi" ), "Must be equal to -1" );
        

    } // testMatillionDemo

} // MatillionDemoTest
