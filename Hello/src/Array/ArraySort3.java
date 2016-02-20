package Array;

import org.junit.Test;

public class ArraySort3 
{
	@Test
	public void moga()
	{
	int[] a={5,7,2,20,13,11};
	mogaSort(a);
	smartsort(a);
	findlargeandsmall(a);
	}
	
	public void mogaSort(int[] x)
	{
		for (int i=0;i<x.length;i++)
		{
		System.out.println(x[i]);
		System.out.println(i+"position="+x[i]);
		}
		System.out.println("Array size = " + x.length);
		
	}
	public void smartsort(int[] x)  
	{
		for(int m:x);	
		
	}	

	public void findlargeandsmall(int[] x)
	{
		 int a[] = new int[]{5,7,2,20,13,11};
         
         
         int smallest = a[0];
         int largetst = a[0];
        
         for(int i=1; i< a.length; i++)
         {
                 if(a[i]>largetst)
                         largetst = a[i];
                  else if (a[i] < smallest)
                     smallest = a[i];          
         }
		
         System.out.println("Largest Number is : " + largetst);
         System.out.println("Smallest Number is : " + smallest);   
	
	}
	

}
