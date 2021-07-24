package day4;

public class Payment {


    public static void main(String[] args) {

        Banking bnk = new Banking();
        bnk.setName("Laharitha");
        bnk.setCvv("256");
        bnk.setCardnumber(1236987454);

        System.out.println("Name of customer : "+ bnk.getName());
        System.out.println("CVV of card : "+ bnk.getCvv());
        System.out.println("Number of card : "+ bnk.getCardnumber());
    }
}
