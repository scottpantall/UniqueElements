/**
 *
 * @author Scott Pantall
 */
import java.io.*;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main (String[] args) throws IOException {
        Path file = Paths.get(args[0]);
        BufferedReader buffer = Files.newBufferedReader(file);
        String line;
        
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            //System.out.println(line);
            unique(line);
        }
    }
    
    public static void unique(String line) {
        String[] numbers = line.split(",");
        Set<String> noDuplicates = new HashSet<String>(Arrays.asList(numbers));
        
        noDuplicates.forEach(number -> System.out.print(number + ","));
        System.out.printf("%n");
    }
}
