package Array;

public class largesmall 
{
		 
        public static void main(String[] args)
        {
               
                int numbers[] = new int[]{5,7,2,20,13,11};
               
              
                int smallest = numbers[0];
                int largetst = numbers[0];
               
                for(int i=1; i< numbers.length; i++)
                {
                        if(numbers[i] > largetst)
                                largetst = numbers[i];
                       else if (numbers[i] < smallest)
                               smallest = numbers[i];
                       
                }
               
                System.out.println("Largest Number is : " + largetst);
                System.out.println("Smallest Number is : " + smallest);
        }
}
 

