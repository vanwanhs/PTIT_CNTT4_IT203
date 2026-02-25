package session06.lesson06;
public class User {
    private String id;
    private String username;
    private String password;
    private String email;
    public User(String id, String username, String password, String email) {
        this.id = id;
        this.username = username;
        setPassword(password); // kiểm soát
        setEmail(email);
    }

    public String getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }
    public void setPassword(String password) {
        if (password != null && !password.trim().isEmpty()) {
            this.password = password;
        } else {
            System.out.println(" Password không được rỗng");
        }
    }

    public void setEmail(String email) {
        if (email != null && email.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$")) {
            this.email = email;
        } else {
            System.out.println(" Email không hợp lệ");
        }
    }
    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
        System.out.println("---------------------");
    }
}
