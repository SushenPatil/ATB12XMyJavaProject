package ex_19_OOPs_Part2.ecap;

public class Lab177 {
    public static void main(String[] args) {

        ICICIbank bank = new ICICIbank("Sushen", 150000);
        System.out.println(bank.getName());
        System.out.println(bank.getBankname());
        System.out.println(bank.getBalance());
       // System.out.println(bank.setBalance(2000000, true));

        boolean iscashier = true;
        bank.setBalance(1000, iscashier);
        System.out.println(bank.getBalance());
    }

}
