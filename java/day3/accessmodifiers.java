package day3;

public class accessmodifiers {

    public static void main(String[] args) {
        accessmodifiers am = new accessmodifiers();
        am.defaultmethod();
        am.privmod();
        am.promod();
        am.pubmod(50,60);
    }
    public void pubmod(int x,int y){

        int sum = x + y;
        System.out.println("sum of two values : " + sum );
    }
    private void privmod(){
        System.out.println("Private Modifier");
    }
    protected void promod(){
        System.out.println(" This is wonderful day ");
    }
    void defaultmethod(){
        System.out.println(" Today is sunny day");
    }


}
