import java.util.ArrayList;
import java.util.Arrays;

public class ALInsertionSort
{

    public static void main(String[] args)
    {
    	Integer myNumbers[] = {0, 15, 6, 8, 2, 37};
    	ArrayList<Integer> sorted = new ArrayList<Integer>();
    	boolean inserted=false;

		//Add the first number to the array list
		sorted.add(myNumbers[0]);

		//Loop once for all of the remaining numbers in the unsorted list
		for(int i = 1; i < myNumbers.length; i++)
		{
			//Check with each of the numbers in the sorted list
			for(int j = i - 1; j > 0; j--)
			{
				//If this number is less than one in the sorted list,
				if(myNumbers[i] < myNumbers[j] && !inserted)
				{
				//insert it there
					sorted.add(j, myNumbers[i]);
					inserted = true;
					
				}
			}
			//If it was not inserted, stick it on the end.
			if(inserted == false)
			{
				sorted.add(myNumbers[i]);
			}
			inserted = false;

		//End Loop for unsorted list
		}

		//Move the data back to the array
		for(int i = 0; i < myNumbers.length; i++)
		{
			myNumbers[i] = sorted.get(i);
		}

		//Print the contents of the array
		System.out.println(Arrays.toString(myNumbers));

    }


}
