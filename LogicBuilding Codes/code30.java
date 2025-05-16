class PowerRecursive {

    
    public static int power(int base, int exponent) {
        if (exponent == 0) {
            return 1; // Base case
        } else {
            return base * power(base, exponent - 1); // Recursive step
        }
    }

    public static void main(String[] args) {
        int base = 2;
        int exponent = 5;
        int result = power(base, exponent);
        System.out.println(base + "^" + exponent + " = " + result);
    }
}

