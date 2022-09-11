class Assign1 {
    public static void main(String[] args) {
        // -----------Question one--------------
        // Addition and subtraction of two numbers
        int num1 = 10;
        int num2 = 20;
        int sum = num1 + num2;
        int diff = num2 - num1;
        System.out.println("Sum of two numbers - " + sum);
        System.out.println("Difference of two numbers - " + diff);

        // -----------Question two--------------
        // Multiplication of two floating numbers
        float num1 = 10.03f;
        float num2 = 20.21f;
        System.out.println("Mulitplication of two numbers - " + (num1*num2));
        
        
        // -----------Question three--------------
        // To print quotient and remainder of numbers
        int num1 = 256;
        int num2 = 14;
        int quotient = num1 / num2;
        int rem = num1 % num2;
        System.out.println("Quotient of the numbers - " + quotient);
        System.out.println("Remainder of the numbers - " + rem);

        
        // -----------Question four--------------
        // First with the use of a temp variable
        int num1 = 5;
        int num2 = 7;
        System.out.println("Before swapping - " + "a: " + num1 + " and b: " + num2);
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After swapping - " + "a: " + num1 + " and b: " + num2);

        // Now without the use of a temp variable
        num1 = 5;
        num2 = 7;
        System.out.println("Before swapping - " + "a: " + num1 + " and b: " + num2);
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("After swapping without temp variable - " + "a: " + num1 + " and b: " + num2);
    }
}