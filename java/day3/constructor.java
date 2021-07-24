package day3;

public class constructor {

    constructor() {
            System.out.println("Hi this is default constructor");

        }
         void constructor(){
        System.out.println("Without passing any parameter");
        }
        public void constructor(String author, String publisher , String title){
            System.out.println("Author :" + author );
            System.out.println("Publisher :" + publisher );
            System.out.println("Title :" + title );
        }

    public static void main(String[] args) {
        //new constructor();
        constructor co = new constructor( );
        co.constructor();
        co.constructor("Lahari","Latter ","pie chart");
    }
    }

