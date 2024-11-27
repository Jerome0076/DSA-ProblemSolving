package DSA.Practice;

import java.util.HashSet;

import org.testng.annotations.Test;

public class SingleNumber_136 {
	
	@Test
	public void testSingleNumber()
	{
		System.out.println(singleNumber(new int[] {2,2,1}));
		
		System.out.println(singleNumber(new int[] {4,1,2,1,2}));
		
		System.out.println(singleNumber(new int[] {1}));
	}

    //Using HashSet
    //Use for each loop to iterate within the array
    //check if the current value is unable to add in set, if so remove the number.
    //print the set
    public int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int num : nums)
        {
            if(!set.add(num))
            {
                set.remove(num);
            }
            
        }
      return set.iterator().next();  
    }
}


