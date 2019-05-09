public class VipCustomer {
    private String name;
    private double creditLimit;
    private String emailAdress;

public VipCustomer(){
    this("NoName",0.0, "empty" );
}

public VipCustomer(double creditLimit, String emailAdress){

    this("NoName", creditLimit, emailAdress);
}

    public VipCustomer(String name, double creditLimit, String emailAdress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAdress = emailAdress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAdress() {
        return emailAdress;
    }


}
