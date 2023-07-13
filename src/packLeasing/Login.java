package packLeasing;
import files.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import fileAPI.fileAPI;

public class Login {
	Attributes Attributes = null;
    private Map<String, UserInfo> userAndPass;

    public Login() {
        userAndPass = new HashMap<>();
    }

    // Add usernames, passwords, and user types to the map
    public void addUser(String username, char[] password, int userType) {
        userAndPass.put(username, new UserInfo(username, password, userType));
    }

    public boolean verifyPassword(String username, String password) {
    	
    	
        if (userAndPass.containsKey(username)) {
        	System.out.println("contains");
            UserInfo userInfo = userAndPass.get(username);
            char[] storedPassword = userInfo.getPassword();
            char[] inputPassword = password.toCharArray();
            return Arrays.equals(storedPassword, inputPassword);
            //return userInfo.getPassword().equals(password.toCharArray());
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
    	fileAPI api = new fileAPI();
    	Map<String, String> userPasswordmap = api.returnUserPasswordMap();
    	Map<String, String> BossPasswordmap = api.returnBossPasswordMap();
    	Map<String, String> WorkerPasswordmap = api.returnWorkerPasswordMap();
    	
    	// Adding users from userPasswordmap
        for (Map.Entry<String, String> entry : userPasswordmap.entrySet()) {
            String username = entry.getKey();
            String password = entry.getValue();

            userAndPass.put(username, new UserInfo(username, password.toCharArray(), Attributes.CLIENT));
        }

        // Adding users from BossPasswordmap
        for (Map.Entry<String, String> entry : BossPasswordmap.entrySet()) {
            String username = entry.getKey();
            String password = entry.getValue();
            userAndPass.put(username, new UserInfo(username, password.toCharArray(), Attributes.ADMIN));
        }

        // Adding users from WorkerPasswordmap
        for (Map.Entry<String, String> entry : WorkerPasswordmap.entrySet()) {
            String username = entry.getKey();
            String password = entry.getValue();
            userAndPass.put(username, new UserInfo(username, password.toCharArray(), Attributes.WORKER));
        }
    	
    	System.out.println(userAndPass);
    	
    	
    }
    
}