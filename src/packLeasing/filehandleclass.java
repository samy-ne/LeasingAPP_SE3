package packLeasing;

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
        	
        	File file = new File("src/files/usernames_passwords.txt"); // Change the path if needed
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
}