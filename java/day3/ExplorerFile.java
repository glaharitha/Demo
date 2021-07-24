package day3;

public class ExplorerFile {

    public static void main(String[] args) {
        String browser = "Chrome";

        if(browser.equalsIgnoreCase("chrome")){
            System.out.println("Open chrome browser");
        }else if(browser.equalsIgnoreCase("firefox")){
            System.out.println("Open firfox browser");
        }else{
            System.out.println("Please enter correct browser");
    }
        System.out.println("Out of condition!");
    }
}
