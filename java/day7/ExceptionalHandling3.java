package day7;

public class ExceptionalHandling3  {

    public static void main(String[] args) throws Exception {
        System.out.println("started*******");

        int amount = 100;
        if(amount < 100){
            throw new Exception("Enter lesser than 100");
        }
        else {
            System.out.println(" with draw");
        }
        System.out.println("ending****************");
    }
}
