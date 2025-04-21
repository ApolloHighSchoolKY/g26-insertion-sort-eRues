import java.util.Arrays;

public class AInsertionSort
{

    public static void main(String[] args)
    {
    	Integer myNumbers[] = {0, 15, 6, 8, 2, 37};
        Integer temp = 0;

        for(int i = 1; i < myNumbers.length; i++)
        {
            for(int j = i - 1; j > 0; j--)
            {
                if(myNumbers[i] < myNumbers[j])
                {
                    temp = myNumbers[j];
                    myNumbers[j] = myNumbers[i];
                    myNumbers[i] = temp;
                    i--;
                }
            }
        }

        System.out.println(Arrays.toString(myNumbers));

    }
}
