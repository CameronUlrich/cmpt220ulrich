
public class Problem5_5 
{

	public static void main(String[] args) 
	{
		System.out.printf("%-12s%8s", "Kilograms", "Pounds");
        System.out.printf("\t\t|\t\t");
        System.out.printf("%-12s%-8s\n", "Pounds", "Kilograms");


	    // JA: The table of the left had increment of 2. The one on the right was until 515.

        for (int i = 1, j = 20; i < 200; i++, j += 5) 
        {
            System.out.printf("%-12d%8.1f", i, i * 2.2);
            System.out.printf("\t\t|\t\t");
            System.out.printf("%-12d%-8.2f\n", j, j / 2.2);
        }

	}

}
