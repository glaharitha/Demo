package day3;

public class primenumber {

    public static void main(String[] args) {

        int i, num, count;
        System.out.println("Enter the prime numbers from 1 to 20 : ");
        for (num = 1; num <= 20; num++) {
            count = 0;

            for (i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0 && num != 0) {
                System.out.println(num + " ");
            }

        }
    }
}
