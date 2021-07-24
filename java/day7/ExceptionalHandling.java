package day7;

public class ExceptionalHandling {

    public static void main(String[] args) {

        System.out.println("started ****************");
        try {
            int x = 10;
            int y = 6;
            int div = x/y;
            System.out.println(div);
        }
        catch (Exception e){
            e.getStackTrace();
        }
        System.out.println("ending **********");
    }
}
