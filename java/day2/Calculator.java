package day2;

public class Calculator {
//          without using return type

    public static void main(String[] args) {

        Calculator cal = new Calculator();
        cal.add(10,20);
        cal.subtraction(60,20);
        cal.multiplication(15,95);
        cal.division(56f,3f);
        cal.modulus(58f,8f);
    }


    public void add(int num1,int num2)
    {

        int sum = num1 + num2 ;
        System.out.println("Addition of two numbers : "+ sum);

    }

    public void subtraction(int num1, int num2)
    {

        int subtract = num1 - num2;
        System.out.println("Subtraction of two values : "+ subtract);

    }
    public void multiplication(int num1, int num2)
    {

        int mul = num1 * num2;
        System.out.println("Multiplication of two values : "+ mul);

    }
    public void division(float num1, float num2)
    {

        float div = num1 / num2;
        System.out.println("Division of two values : "+ div);

    }
    public void modulus(float num1, float num2)
    {

        float mod = num1 % num2;
        System.out.println("Remainder of two numbers : "+ mod);

    }
}
