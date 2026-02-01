package session06.lesson02;
public class Account {
    private String userName;
    private String passWord;
    private String email;

    public Account(String userName, String passWord, String email) {
        this.userName = userName;
        this.passWord = passWord;
        this.email = email;
    }
    public void changePassword(String newPassword){
        this.passWord = newPassword;
    }
    public void display() {
        System.out.println("Username: " + userName);
        System.out.println("Password: ********");
        System.out.println("Email: " + email);
        System.out.println("--------------------");
    }
}

