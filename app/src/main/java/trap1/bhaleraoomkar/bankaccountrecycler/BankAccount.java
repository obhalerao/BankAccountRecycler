package trap1.bhaleraoomkar.bankaccountrecycler;

public class BankAccount {
    private int id;
    private String name;
    private long money;

    public BankAccount(){}

    public BankAccount(int id, String name, long money){
        this.id=id;
        this.name=name;
        this.money=money;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getMoney() {
        return money;
    }

    public void setMoney(long money) {
        this.money = money;
    }
}
