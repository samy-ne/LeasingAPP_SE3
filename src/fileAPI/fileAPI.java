package fileAPI;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import files.*;
import packLeasing.Contract;
import packLeasing.Vehicles;
public class fileAPI {
	//to call api: fileAPI api = new fileAPI()
	//to call methods: Hashmap<String,String> hm =  api.returnUserPasswordMap() etc...
	//api.insertnewuser(String,String)
	//api.insertnewworker(String,String)
	private static ArrayList<Vehicles> _fileAPI_all_vehicles;
	public void setVehicleArray(ArrayList<Vehicles> allV) {
		_fileAPI_all_vehicles = allV;
	}
	public static int getIndexVfVehicleVnVehicleArray(Vehicles v) {
		return _fileAPI_all_vehicles.indexOf(v);
	}
	public HashMap<String, ArrayList<String>> getAllUserContracts() {
		// this method returns a map with the username:contractid (as a string)
		HashMap<String, ArrayList<String>> userContractMap = new HashMap<>();
		
        filehandleclass fh = new filehandleclass();
        List<String> fileContents = fh.getUserContractfile();
        for (String line : fileContents) {
            String[] parts = line.split(":");
            if (parts.length == 2) {
                String user = parts[0];
                String contractID = parts[1];
                // Check if the user already exists in the map
                if (userContractMap.containsKey(user)) {
                    // If the user exists, get the existing ArrayList and add the new contract ID
                    ArrayList<String> contractList = userContractMap.get(user);
                    contractList.add(contractID);
                } else {
                    // If the user doesn't exist, create a new ArrayList and add the contract ID
                    ArrayList<String> contractList = new ArrayList<>();
                    contractList.add(contractID);
                    userContractMap.put(user, contractList);
                }
            
            }
        }
        
        //System.out.println("these are all the v");
       // System.out.println(userContractMap);
        //System.out.println("these are all the v");
        return userContractMap;
	}
	public List<Contract> getAllContracts() {
		List<Contract> contracts = new ArrayList<>();
		filehandleclass fh = new filehandleclass();
        List<String> fileContents = fh.getContractsVehiclesfile();
        
        // System.out.println(_fileAPI_all_vehicles.get(4));
        if (fileContents != null) {
            for (String line : fileContents) {
                String[] parts = line.split(":");
                if (parts.length == 4) {
                    int contractID = Integer.parseInt(parts[0]);
                    LocalDate startDate = LocalDate.parse(parts[1]);
                    LocalDate finishDate = LocalDate.parse(parts[2]);
                    int vehicleID = Integer.parseInt(parts[3]);
                    //System.out.println(startDate);
                    //System.out.println(finishDate);
                    //System.out.println(contractID);
                    //System.out.println(vehicleID);
                    Vehicles vehicle = _fileAPI_all_vehicles.get(vehicleID);;
                    
                    if (vehicle != null) {
                        Contract contract = new Contract(contractID, startDate, finishDate, vehicle);
                        
	                    contract.toString();
                        contracts.add(contract);
                    }
                }
            }
        }
        
        
        return contracts;
        
    }
	private static Vehicles getVehicleById(int vehicleID) {
        //unused
        return null;
    }
	
	
	public int insertContract(String user,int contractID) {
		//this method inserts contract as  String:String of user:contract
		String contractString = user + ":" + contractID;
        filehandleclass fh = new filehandleclass();
        fh.appendToUserContractFile(contractString);
        return 1;
	}
	public int insertVehicleWithContract(int ContractID,int Vehicle,LocalDate date1, LocalDate date2) {
		//this method inserts contract as  String:String of user:contract
		String contractVehicleString = ContractID + ":" +date1.toString()+":"+date1.toString()+":"+ Vehicle;
        filehandleclass fh = new filehandleclass();
        fh.appendToUserContractVehiclesFile(contractVehicleString);
        return 1;
	}
	
	public int insertNewWorker(String user,String password) {
		 
		 //check if exists if already exists return -1
		HashMap<String, String> WorkerPassMap = returnWorkerPasswordMap();
		if(WorkerPassMap.containsKey(user)) {
			System.out.println("Worker '" + user + "' already exists in the system.");
           return -1;
		}
		
		String line = user + ":" + password + ":" + "2";
		System.out.println(line);
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
		
		String line = "\n"+user + ":" + password + ":" + "2"+"\n";
		System.out.println(line);
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
	public void appendVehicleToTicketFile(int vehicleID) {
		filehandleclass fh = new filehandleclass();
		fh.appendToVehicleTicketFile(Integer.toString(vehicleID));
	}
	public ArrayList<Integer> returnVehiclesWithTickets(){
		ArrayList<Integer> vehiclesWithTickets = new ArrayList<>();
        filehandleclass fh = new filehandleclass();
        List<String> fileContents = fh.getVehicleTicketfile();
        if (fileContents != null) {
            for (String line : fileContents) {
                try {
                    int vehicleID = Integer.parseInt(line.trim());
                    vehiclesWithTickets.add(vehicleID);
                } catch (NumberFormatException e) {
                   
                }
            }
        }

        return vehiclesWithTickets;
	
	}
	public HashMap<String, String> returnWorkerPasswordMap() {
		HashMap<String, String> UserPassMap = new HashMap<String,String>();
		
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
