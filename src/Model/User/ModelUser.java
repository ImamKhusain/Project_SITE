package Model.User;

public class ModelUser {
    private int id;
    private String username, password;

    public ModelUser(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }
     public ModelUser() {
        
    }

    // Getter dan Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public void setPassword(String password) {
        this.password = password;
    }
}
