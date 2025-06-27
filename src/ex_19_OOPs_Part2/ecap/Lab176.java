package ex_19_OOPs_Part2.ecap;

public class Lab176 {
    public static void main(String[] args) {

        VWO_Login vwologin = new VWO_Login("Admin" ,"pass123");
        System.out.println(vwologin.password);
        vwologin.password="345";
        System.out.println(vwologin.password);

        GoodVWOLogin goodVWOLogin = new GoodVWOLogin("Admin","pass123");
       // System.out.println(goodVWOLogin.password);
        System.out.println(goodVWOLogin.getUsername());
        System.out.println(goodVWOLogin.getPassword() );

        goodVWOLogin.setUsername("sushen");
        System.out.println(goodVWOLogin.getUsername());

        goodVWOLogin.setPassword("123456",true);
        System.out.println(goodVWOLogin.getPassword());


    }
}
