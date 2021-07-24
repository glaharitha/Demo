package day6;

public interface Cars {

    // abstract method
    void windshield();
    void doors();
    void wheels();
    void glass();

    // non abstract method
    default void defmethod(){
        System.out.println(" Default method ");
    }

}
