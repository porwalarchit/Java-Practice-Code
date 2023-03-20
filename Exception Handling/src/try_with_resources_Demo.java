//program that reads the data in a file using try-with-resources statement.
import java.io.FileReader;
import java.io.IOException;

public class try_with_resources_Demo {
    public static void main(String args[]) {
        try(FileReader fr = new FileReader("E://file.txt")) {
            char [] a = new char[50];
            fr.read(a);   // reads the content to the array
            for(char c : a)
                System.out.print(c);   // prints the characters one by one
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}