package day4;

public class Banking {

    private  String name;
    private  String cvv;
    private  long cardnumber;


    public void setName(String name) {
        this.name = name;
    }
    public  String getName(){
        return name;
    }
    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public long getCardnumber() {
        return cardnumber;
    }

    public void setCardnumber(long cardnumber) {
        this.cardnumber = cardnumber;
    }
}
