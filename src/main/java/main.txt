import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Created by doug on 7/27/16.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello Iron Yard Student!");

        Files.write(Paths.get("mainWasRun.txt"), "The Main class' main() method was run!".getBytes());

        System.out.println("This program created a new file on disk named 'mainWasRun.txt'!");
    }
}
