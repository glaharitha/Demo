package day5;

public class polymorphism {

    public static void main(String[] args) {

        RBI rbi;

        rbi = new SBI();
        System.out.println("SBI "+  rbi.getRateofInt());
        rbi = new HDFC();
        System.out.println("HDFC "+  rbi.getRateofInt());
    }
}
