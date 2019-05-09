import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
Account alexsAccount = new Account("12345", 0.00, "Alex Alexeev", "my@email.com", "555-555");
        System.out.println(alexsAccount.getNumber());
        System.out.println(alexsAccount.getBalance());
        //alexsAccount.setNumber("12345");
//alexsAccount.setBalance(0.00);
//alexsAccount.setCustomerName("Alex Alexeev");
//alexsAccount.setCustomerEmailAdress("my@email.com");
//alexsAccount.setCustomerPhoneNumber("555-555");
alexsAccount.withdrawal(100);
alexsAccount.deposit(50.0);
alexsAccount.withdrawal(100.0);
alexsAccount.deposit(51.0);
alexsAccount.withdrawal(100.0);

//VipCustomer sam = new VipCustomer();
//        System.out.println(sam.getName()+" "+sam.getCreditLimit()+" "+sam.getEmailAdress());
//
//VipCustomer john = new VipCustomer(12,"john@mail.com");
//        System.out.println(john.getName()+" "+john.getCreditLimit()+" "+john.getEmailAdress());
//
//VipCustomer fred = new VipCustomer("Fred",100.2, "fred@mail.com");
//        System.out.println(fred.getName()+" "+fred.getCreditLimit()+" "+fred.getEmailAdress());




    }
}
