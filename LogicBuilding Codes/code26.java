class FactorsOfNum
{
    public static void main (String[]args)
    {

        int num = 100;
        getFactors (num);
    }

    static void getFactors (int num)
    {

        for (int i = 1; i <= (num/2); i++)
        {
            if (num % i == 0)
            {
                System.out.print(i + " ");
            }
        }
		// print thenumber itself too
		System.out.print(num);
    }
}
