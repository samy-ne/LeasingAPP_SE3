package files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class filehandleclass {
	public void appendToFile(String a) {
        try {
        	//src/files/usernames_passwords.txt
        	File file = new File("files/usernames_passwords.txt"); // Change the path if needed
        	BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
        	
        	//File f = new File("usernames_passwords.txt‬");
            //String absolute = f.getAbsolutePath();
            //BufferedWriter writer = new BufferedWriter(new FileWriter(absolute, true));
            writer.write(a);
            writer.newLine(); // Add a new line after each write, if needed.
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	public void removeVehicleAtIndex(int index) {
        List<String> fileContents = getVehicleTicketfile();

        if (fileContents != null) {
            String indexChar = String.valueOf(index);

            // Remove all occurrences of the character representing the index from the list
            fileContents.removeIf(id -> id.equals(indexChar));

            // Update the "VehicleTicket.txt" file with the modified contents
            try {
                ClassLoader classLoader = getClass().getClassLoader();
                File file = new File(classLoader.getResource("files/VehicleTicket.txt").getFile());
                BufferedWriter writer = new BufferedWriter(new FileWriter(file, false));

                for (String line : fileContents) {
                    writer.write(line);
                    writer.newLine();
                }

                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

	public List<String> getVehicleTicketfile() {
		List<String> fileContent = new ArrayList<>();
		try {
			ClassLoader classLoader = getClass().getClassLoader();
            InputStream inputStream = classLoader.getResourceAsStream("files/VehicleTicket.txt");
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

			//File f = new File("usernames_passwords.txt‬");
			//String absolute = f.getAbsolutePath();
			//BufferedReader reader = new BufferedReader(new FileReader("C:/Users/lipov/eclipse-workspace/filepackproject/src/files/userandpass.txt"));
			//BufferedReader reader = new BufferedReader(new FileReader(absolute));
			String line;
			while ((line = reader.readLine()) != null) {
                fileContent.add(line);
            }
			
            reader.close();
            return fileContent;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public void appendToVehicleTicketFile(String a) {
        try {
        	//src/files/usernames_passwords.txt
        	
        	File file = new File("files/VehicleTicket.txt"); // Change the path if needed
        	BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
        	
        	//File f = new File("usernames_passwords.txt‬");
            //String absolute = f.getAbsolutePath();
            //BufferedWriter writer = new BufferedWriter(new FileWriter(absolute, true));
            writer.write(a);
            writer.newLine(); // Add a new line after each write, if needed.
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	public void appendToUserContractVehiclesFile(String a) {
        try {
        	//src/files/usernames_passwords.txt
        	File file = new File("files/contracts_vehicles.txt"); // Change the path if needed
        	BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
        	
        	//File f = new File("usernames_passwords.txt‬");
            //String absolute = f.getAbsolutePath();
            //BufferedWriter writer = new BufferedWriter(new FileWriter(absolute, true));
        	writer.newLine();
            writer.write(a);
            writer.newLine(); // Add a new line after each write, if needed.
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	public void appendToUserContractFile(String a) {
        try {
        	//src/files/usernames_passwords.txt
        	File file = new File("files/user_contract.txt"); // Change the path if needed
        	BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
        	
        	//File f = new File("usernames_passwords.txt‬");
            //String absolute = f.getAbsolutePath();
            //BufferedWriter writer = new BufferedWriter(new FileWriter(absolute, true));
            writer.write(a);
            writer.newLine(); // Add a new line after each write, if needed.
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	public List<String> getContractsVehiclesfile() {
		List<String> fileContent = new ArrayList<>();
		try {
			ClassLoader classLoader = getClass().getClassLoader();
            InputStream inputStream = classLoader.getResourceAsStream("files/contracts_vehicles.txt");
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

			//File f = new File("usernames_passwords.txt‬");
			//String absolute = f.getAbsolutePath();
			//BufferedReader reader = new BufferedReader(new FileReader("C:/Users/lipov/eclipse-workspace/filepackproject/src/files/userandpass.txt"));
			//BufferedReader reader = new BufferedReader(new FileReader(absolute));
			String line;
			while ((line = reader.readLine()) != null) {
                fileContent.add(line);
            }
			
            reader.close();
            return fileContent;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public List<String> getfile() {
		List<String> fileContent = new ArrayList<>();
		try {
			ClassLoader classLoader = getClass().getClassLoader();
            InputStream inputStream = classLoader.getResourceAsStream("files/usernames_passwords.txt");
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

			//File f = new File("usernames_passwords.txt‬");
			//String absolute = f.getAbsolutePath();
			//BufferedReader reader = new BufferedReader(new FileReader("C:/Users/lipov/eclipse-workspace/filepackproject/src/files/userandpass.txt"));
			//BufferedReader reader = new BufferedReader(new FileReader(absolute));
			String line;
			while ((line = reader.readLine()) != null) {
                fileContent.add(line);
            }
			
            reader.close();
            return fileContent;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public List<String> getUserContractfile() {
		List<String> fileContent = new ArrayList<>();
		try {
			ClassLoader classLoader = getClass().getClassLoader();
            InputStream inputStream = classLoader.getResourceAsStream("files/user_contract.txt");
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

			//File f = new File("usernames_passwords.txt‬");
			//String absolute = f.getAbsolutePath();
			//BufferedReader reader = new BufferedReader(new FileReader("C:/Users/lipov/eclipse-workspace/filepackproject/src/files/userandpass.txt"));
			//BufferedReader reader = new BufferedReader(new FileReader(absolute));
			String line;
			while ((line = reader.readLine()) != null) {
                fileContent.add(line);
            }
			
            reader.close();
            return fileContent;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
