class PerfectNumber2
{
    public static void main (String[]args)
    {
        int num = 28;

        if (isPerfect(num))
            System.out.println (num + " Is a perfect number");
        else
            System.out.println (num + " Is not a perfect number");

    }

    private static boolean isPerfect(int num) {
        int sum = 0;
        
       
        for (int i = 1; i <= num/2; i++){
            if (num % i == 0)
                sum = sum + i;
        }

        if (sum == num)
            return true;

        return false;
    }
}
