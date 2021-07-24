package day6;

public class Vinue implements Cars{

    public void windshield() {
    System.out.println("Wind shield cover");
    }


    public void doors() {
    System.out.println("Car has 4 doors");
    }

    public void wheels() {
        System.out.println("wheels has air in it");

    }

    public void glass() {
    System.out.println("Glass is broken");
    }

    public static void main(String[] args) {
        Vinue v = new Vinue();
        v.doors();
        v.glass();
        v.wheels();
        v.windshield();
        v.scheduledetails();
    }
    public void scheduledetails(){
        System.out.println("Please schedule your time ");
    }
}
