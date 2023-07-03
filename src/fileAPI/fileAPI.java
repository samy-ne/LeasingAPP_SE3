package fileAPI;

import java.util.HashMap;
import java.util.List;

import files.*;
public class fileAPI {
	//to call api: fileAPI api = new fileAPI()
	//to call methods: Hashmap<String,String> hm =  api.returnUserPasswordMap() etc...
	//api.insertnewuser(String,String)
	//api.insertnewworker(String,String)
	public int insertNewWorker(String user,String password) {
		 
		 //check if exists if already exists return -1
		HashMap<String, String> WorkerPassMap = returnWorkerPasswordMap();
		if(WorkerPassMap.containsKey(user)) {
			System.out.println("Worker '" + user + "' already exists in the system.");
           return -1;
		}
		
		String line = user + ":" + password + ":" + "2";
		filehandleclass fh = new filehandleclass();
		fh.appendToFile(line);
		return 1;
	}
	public int insertNewUser(String user,String password) {
		 
		 //check if exists if already exists return -1
		HashMap<String, String> UserPassMap = returnUserPasswordMap();
		if(UserPassMap.containsKey(user)) {
			System.out.println("User '" + user + "' already exists in the system.");
            return -1;
		}
		
		String line = user + ":" + password + ":" + "2"+"\n";
		filehandleclass fh = new filehandleclass();
		fh.appendToFile(line);
		return 1;
	}
	
	public HashMap<String, String> returnUserPasswordMap() {
		HashMap<String, String> UserPassMap = new HashMap<String,String>();
		//code to import the file contents and place to map
		filehandleclass fh = new filehandleclass();
		List<String> fileContents = fh.getfile();
		for(String line:fileContents) {
			String[] parts = line.split(":");
			if(parts.length == 3) {
				String user = parts[0];
				String password = parts[1];
				int type = Integer.parseInt(parts[2]);
				if(type == 2) {
					UserPassMap.put(user, password);
				}
			}
		}
		
		
		return UserPassMap;
		
	}
	
	public HashMap<String, String> returnWorkerPasswordMap() {
		HashMap<String, String> UserPassMap = new HashMap<String,String>();
		//code to import the file contents and place to map
		filehandleclass fh = new filehandleclass();
		List<String> fileContents = fh.getfile();
		for(String line:fileContents) {
			String[] parts = line.split(":");
			if(parts.length == 3) {
				String user = parts[0];
				String password = parts[1];
				int type = Integer.parseInt(parts[2]);
				if(type == 1) {
					UserPassMap.put(user, password);
				}
			}
		}
		
		
		return UserPassMap;
		
	}
	public HashMap<String, String> returnBossPasswordMap() {
		HashMap<String, String> UserPassMap = new HashMap<String,String>();
		//code to import the file contents and place to map
		filehandleclass fh = new filehandleclass();
		List<String> fileContents = fh.getfile();
		for(String line:fileContents) {
			String[] parts = line.split(":");
			if(parts.length == 3) {
				String user = parts[0];
				String password = parts[1];
				int type = Integer.parseInt(parts[2]);
				if(type == 3) {
					UserPassMap.put(user, password);
				}
			}
		}
		
		
		return UserPassMap;
		
	}
	
}
