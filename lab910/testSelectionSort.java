package lab910;

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;



public class testSelectionSort {
	@Test
	public void test() {
		testPositive();
		testNegative();
		testZero();
		testDuplicates();
	}

    public testSelectionSort() {
    }
    
    public void testPositive(){
        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = 2;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = 2;
        Sortedarr[1] = 7;
        Sortedarr[2] = 8;
        Sortedarr[3] = 9;
        Sortedarr[4] = 10;
        
        /** add tests to check for this unit test **/
        Assert.assertEquals(arr[0], 7);
    }
    
    public void testNegative(){
        
        /** Test data contains negative values only **/
    	 int[] arr = new int[5];
         arr[0] = -23;
         arr[1] = -3;
         arr[2] = -50;
         arr[3] = -10;
         arr[4] = -1;
         
         Assert.assertTrue(arr[0] < 0);
         Assert.assertTrue(arr[1] < 0);
         Assert.assertTrue(arr[2] < 0);
         Assert.assertTrue(arr[3] < 0);
         Assert.assertTrue(arr[4] < 0);   
    }
    public void testZero() {
    	
    	/** Test data contains zero values only **/
    	int[] arr = new int[5];
        arr[0] = 0;
        arr[1] = 0;
        arr[2] = 0;
        arr[3] = 0;
        arr[4] = 0;
       
        Assert.assertEquals(arr[0], 0);
        Assert.assertEquals(arr[1], 0);
        Assert.assertEquals(arr[2], 0);
        Assert.assertEquals(arr[3], 0);
        Assert.assertEquals(arr[4], 0);
    }
    public void testMixed(){
        
        /** Test data contains with both positive, negative and zeros **/
    }
    
    public void testDuplicates(){
        
        /** Test data contains duplicates **/
    }


}
