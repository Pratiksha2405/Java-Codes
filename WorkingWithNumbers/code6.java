 class LCM2
{
  public static void main (String[]args)
  {
    int num1 = 144, num2 = 32;

    int hcf = getHCF (num1, num2);
      System.out.println ("The HCF: " + hcf);

    // LCM formula
    int lcm = (num1 * num2) / hcf;
      System.out.println ("The LCM: " + lcm);



  
  }
  static int getHCF (int num1, int num2)
  {
    // Handles the case when one of the number is 0 (num1)
    // Check alert above in explanation
    if (num1 == 0)
      return num2;

    // Handles the case when one of the number is 0 (num2)
    // Check alert above in explanation
    if (num2 == 0)
      return num1;

    // base case
    if (num1 == num2)
      return num1;

    // num1 is greater
    if (num1 > num2)
      return getHCF (num1 - num2, num2);

    return getHCF (num1, num2 - num1);
  }
}
