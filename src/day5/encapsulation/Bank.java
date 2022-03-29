package day5.encapsulation;

import static day5.encapsulation.AccountType.CURRENT;
import static day5.encapsulation.AccountType.SAVING;

public class Bank {

    public static void main(String[] args) {
        Account account1= new Account();
        /*account1.name="taman";
        account1.age=40;
        account1.accountNumber="001";
        account1.accountBalance=10000;
        account1.socialSecurityNumber="123";
        account1.accountType=SAVING;
        System.out.println(account1.name);
        System.out.println(account1.accountBalance);*/
        account1.setName("taman");
        account1.setAge(30);
        account1.setAccountNumber("001");
        account1.setAccountBalance(100);
        account1.setSocialSecurityNumber("1@1");
        account1.setAccountType(SAVING);
        System.out.println(account1.getName());
        //(abstract)System.out.println(account1.getSocialSecurityNumber());

        Account account2= new Account();
        account2.setName("DIL");
        account2.setAge(30);
        account2.setAccountNumber("002");
        account2.setAccountBalance(20000);
        account2.setSocialSecurityNumber("124");
        account2.setAccountType(CURRENT);
        System.out.println(account2.getAccountType());
        account2.transferBalance(account1,account2,50);


    }
}
