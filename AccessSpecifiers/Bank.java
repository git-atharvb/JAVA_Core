package BasicJavaPrograms.AccessSpecifiers;
class Account {
    public String name;
    protected String email;
    private String password; // Not accessible outside this class
    //getters and setters for password
    public void setPassword(String password) {
        this.password = password;
    }
    public String getPassword() {
        setPassword(password);
        return this.password;
    }
}
public class Bank {
    public static void main(String[] args) {
        Account account = new Account();
        account.name = "Atharv Bowlekar"; // Accessible because it's public
        account.email = "atharv.bowlekar@example.com"; // Accessible because it's protected
        account.setPassword("mySecretPassword"); // Accessible through the setter method
        System.out.println(account.getPassword()); // Not accessible directly, but can be accessed through a getter method if implemented
    }
}