package be.intecbrussel.model;

/**
 *
 */
public class User {


    private int id;
    private String name;
    private String adress;
    private String phoneNr;
    private String eMail;

    private Account account;

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhoneNr() {
        return phoneNr;
    }

    public void setPhoneNr(String phoneNr) {
        this.phoneNr = phoneNr;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Account getAccount() {
        return account;
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
        return String.format("Name:%s Adress:%s Phone Number:%s E-mail:%s", name, adress, phoneNr, eMail);
    }


}
