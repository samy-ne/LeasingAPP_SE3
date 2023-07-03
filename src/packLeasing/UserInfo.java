package packLeasing;

// Inner class representing user information
public class UserInfo {
    private String username;
    private char[] password;
    private int userType;

    public UserInfo(String username, char[] password2, int userType) {
        this.username = username;
        this.password = password2;
        this.userType = userType;
    }

    public String getUsername() {
        return username;
    }

    public char[] getPassword() {
        return password;
    }

    public int getUserType() {
        return userType;
    }
}
