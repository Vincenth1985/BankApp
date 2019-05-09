package model;

public class User {


    private int id;
    private String name;
    private String adress;
    private String phoneNr;
    private String eMail;

    Account account;

    public User() {
    }

    public User(int id, String name, String adress, String phoneNr, String eMail, Account account) {
        account.setId(id);
        this.id = id;
        this.name = name;
        this.adress = adress;
        this.phoneNr = phoneNr;
        this.eMail = eMail;
        this.account = account;


    }

    public void checkBalance() {
        System.out.printf("%nBalance : %.2f EUR%n", account.getBalance());
    }

    public void deposit(double deposit) {

        account.deposit(deposit);
    }


    public void withDraw(double withDraw) {
        account.withdraw(withDraw);


    }

    public void setChangeAnnuelRate(double annuelRate) {

        account.setAnnualInterestRate(annuelRate);

    }

    @Override
    public String toString() {
        return account.toString() + "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                ", phoneNr='" + phoneNr + '\'' +
                ", eMail='" + eMail + '\'' + '}';
    }


}
