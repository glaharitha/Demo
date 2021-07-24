package day6;

public class iphone extends Mobile{
// abstract method
    void flashlight(){
        System.out.println("Flash light");
    }

    public static void main(String[] args) {
        iphone ip = new iphone();
        ip.battery();
        ip.flashlight();
    }
}
