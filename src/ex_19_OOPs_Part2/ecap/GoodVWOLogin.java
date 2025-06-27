package ex_19_OOPs_Part2.ecap;

public class GoodVWOLogin {
   private String username;
    private String password;

    // Called parameter constructor

    public GoodVWOLogin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password, boolean isallowed){
        if(isallowed){
            this.password = password;
        }else {
            System.out.println(" Is not allowed");
        }

    }
}
