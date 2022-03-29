package day5.encapsulation;

public class Account {
    /*String name;
    int age;
    double accountBalance;
    String accountNumber;
    String socialSecurityNumber;
    AccountType accountType;*/

    private String name;
    private int age;
    private double accountBalance;
    private String accountNumber;
    private String socialSecurityNumber;
    private AccountType accountType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    /*public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }*/
    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }
    public AccountType getAccountType() {
        return accountType;
    }
    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }
    public void transferBalance(Account fromAccount,Account toAccount,double amountToBeTransfered) {

    }


}
