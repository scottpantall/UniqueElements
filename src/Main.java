/**
 *
 * @author Scott Pantall
 */
import java.io.*;
import java.nio.file.*;
import java.util.*;

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
        ArrayList<String> uniques = new ArrayList<>();
        
        for(int i = 0; i < numbers.length; i++) {
            if(!uniques.contains(numbers[i])) {
                uniques.add(numbers[i]);
            }
        }
        
        for(String s : uniques) {
            System.out.print(s);
            if(uniques.indexOf(s) != uniques.size() - 1) {
                System.out.print(",");
            }
            else {
                System.out.printf("%n");
            }
        }
    }
}
