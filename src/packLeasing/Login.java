package packLeasing;
import files.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import fileAPI.fileAPI;

//import fileAPI.fileAPI;

public class Login {
	Attributes Attributes = null;
    private Map<String, UserInfo> userAndPass;
    private String currentUser;
    public Login() {
        userAndPass = new HashMap<>();
    }
    public String getCurrentUser() {
    	return this.currentUser;
    }
    
    // Add usernames, passwords, and user types to the map
    public void addUser(String username, char[] password, int userType) {
    	fileAPI api = new fileAPI();
        //userAndPass.put(username, new UserInfo(username, password, userType));
        //printUserAndPass(); 
        // TODO 
        // insert the username password userType into the file ...
    	if(userType == 2) {//add client
    		
    		api.insertNewUser(username, String.valueOf(password));
    	}
    	if(userType == 3) {//add worker
    		api.insertNewWorker(username, password.toString());
    	}
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

    
    public void printUserAndPass() {
       	System.out.println("Admin = 1,Client = 2,Worker = 3");
        for (Map.Entry<String, UserInfo> entry : userAndPass.entrySet()) {
            String username = entry.getKey();
            UserInfo userInfo = entry.getValue();
            char[] password = userInfo.getPassword();
            int userType = userInfo.getUserType();
            //System.out.println("Username:" + username +" Password:" + new String(password)+ " UserType:" + userType);
        }
    }
    public int check_if_user_exists(String currentuser) {
    	fileAPI api = new fileAPI();
    	
    	Map<String, String> userPasswordmap = api.returnUserPasswordMap();
    	for(Map.Entry<String, String> entry : userPasswordmap.entrySet()) {
    		String username = entry.getKey();
    		if(currentuser.equals(username)) {
    			return 1;
    			
    		}
    	}
    	return -1;
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
    	
    	//System.out.println(userAndPass);
    	
    	
    }
    
}