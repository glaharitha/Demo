package day2;

public class calculator3 {

    public static void main(String[] args) {
        calculator3 cal =new calculator3();
        int val = cal.add(40,20);
        System.out.println("Addition of two numbers : "+val);
        int s = cal.sub(60,20);
        System.out.println("Subtraction of two numbers : "+ s);
        int m = cal.mul(750,20);
        System.out.println("Multiplication of two numbers : "+ m);
        float d = cal.div(730f,20f);
        System.out.println("Division of two numbers : "+ d);
        float mo = cal.mod(70f,20f);
        System.out.println("Modulus of two numbers : "+ mo);
    }

    public int add(int num1,int num2){

        int sum = num1 +num2;
        return sum;
    }
    public int sub(int num1, int num2){
        int subtraction = num1- num2;
        return subtraction;
    }
    public int mul(int num1, int num2){
        int multiplication = num1 *  num2;
        return multiplication;
    }
    public float div(float num1, float num2){
        float division = num1 / num2;
        return division;
    }
    public float mod(float num1, float num2){
        float modulus = num1 %  num2;
        return modulus;
    }
}
