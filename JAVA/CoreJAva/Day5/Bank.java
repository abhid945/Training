//Bank class with encapsulation


package Week_1.Day5;

 class Bankattributes {
    int money;
    static float rateOfInterest = 6.5F;
    private String Name, Address;
    private long moneydeposit, MoneyWithdrawal;
    private long AccountNumber;

    public static float getRateOfInterest() {
        return rateOfInterest;
    }

    public static void setRateOfInterest(float rateOfInterest) {
        Bankattributes.rateOfInterest = rateOfInterest;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public long getMoneydeposit() {
        money += moneydeposit;
        return moneydeposit;
    }

    public void setMoneydeposit(long moneydeposit) {
        this.moneydeposit = moneydeposit;
    }

    public long getMoneyWithdrawal() {
        money -= MoneyWithdrawal;
        return MoneyWithdrawal;
    }

    public void setMoneyWithdrawal(long moneyWithdrawal) {
        MoneyWithdrawal = moneyWithdrawal;
    }

    public long getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        AccountNumber = accountNumber;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "Name='" + Name + '\'' +
                ", Address='" + Address + '\'' +
                ", moneydeposit=" + moneydeposit +
                ", MoneyWithdrawal=" + MoneyWithdrawal +
                ", AccountNumber=" + AccountNumber +
                '}';
    }

}

public class Bank{
    public static void main(String[] args) {
        Bankattributes bankattributes = new Bankattributes();

        bankattributes.setAccountNumber(123456789);
        bankattributes.setAddress("Mumbai");
        bankattributes.setMoneydeposit(10000);
        bankattributes.setMoneyWithdrawal(1000);
        bankattributes.setName("Abhishek Dubey");
        System.out.println(bankattributes);
    }
}


// Output
//  Bank{Name='AbhishekDubey', Address='Mumbai', moneydeposit=10000, MoneyWithdrawal=1000, AccountNumber=123456789}