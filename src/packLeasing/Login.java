package packLeasing;

import java.util.HashMap;
import java.util.Map;

public class Login {
    private Map<String, UserInfo> userAndPass;

    public Login() {
        userAndPass = new HashMap<>();
    }

    // Add usernames, passwords, and user types to the map
    public void addUser(String username, String password, int userType) {
        userAndPass.put(username, new UserInfo(username, password, userType));
    }

    public boolean verifyPassword(String username, String password) {
        if (userAndPass.containsKey(username)) {
            UserInfo userInfo = userAndPass.get(username);
            return userInfo.getPassword().equals(password);
        }
        return false;
    }

    public int getUserType(String username) {
        if (userAndPass.containsKey(username)) {
            UserInfo userInfo = userAndPass.get(username);
            return userInfo.getUserType();
        }
        else {
        	return Attributes.INVALID_USER;
        }
    }

    public void readUserAndPasswordsFromFile(String fileName) {
        // Implement reading user information from the file
    	////Admin = 1;
		//Client = 2;
		//Worker = 3;
    	// each line in the shape username:password:usertype
    }
    
}