package packLeasing;

// Inner class representing user information
public class UserInfo {
    private String username;
    private String password;
    private int userType;

    public UserInfo(String username, String password, int userType) {
        this.username = username;
        this.password = password;
        this.userType = userType;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getUserType() {
        return userType;
    }
}
