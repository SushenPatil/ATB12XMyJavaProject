package ex_19_OOPs_Part2.ecap;

public class ICICIbank {
    private String name;
   private long balance;
    public String bankname = "ICICI";

// called parameter constructor
    public ICICIbank(String name, long balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(long balance ,boolean iscashier) {
        if(iscashier) {
            this.balance = balance;
        }else{
            System.out.println(" Not allowed set balance");
        }

    }

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname;
    }
}
