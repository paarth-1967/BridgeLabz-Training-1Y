import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadDemo {
    public static void main(String[] args) {
        try {
            // Attempt to open the file
            BufferedReader br = new BufferedReader(new FileReader("data.txt"));
            
            String line;

            // Read and print file content line by line
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close(); // Close the file

        } catch (IOException e) {
            // Handle exception if file not found or cannot be read
            System.out.println("File not found");
        }
    }
}