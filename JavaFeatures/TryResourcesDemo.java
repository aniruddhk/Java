package JavaFeatures;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryResourcesDemo {
    public static void main(String[] args) throws FileNotFoundException {
        BufferedReader reader = new BufferedReader(new FileReader("file.txt"));
        try (reader) {
            System.out.println(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        var x = getMethod();
        var y=10;
    }

    private static Object getMethod() {
        return "str";
    }
}
