import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class CommandLineTest {

    @Test
    // rename src/main/java/main.txt to src/main/java/Main.java
    public void renameMainTest(){
        assertThat("Didn't rename Main.java to Main.java",
                Files.exists(Paths.get("src/main/java/Main.java")), is(true));
    }

    @Test
    // the program should have been run via `gradle run -q`
    public void mainWasRunTest(){
        assertThat("Didn't run 'gradle -run'",
                Files.exists(Paths.get("mainWasRun.txt")), is(true));
    }

    @Test
    // create a folder named src/main/resources/images
    public void imageFolderCreatedTest(){
        assertThat("Images folder was not created",
                Files.exists(Paths.get("src/main/resources/images")), is(true));
    }

    @Test
    // src/main/resources/images is a folder
    public void imageFolderIsAFolderTest(){
        assertThat("src/main/resources/images folder is not a folder",
                Files.isDirectory(Paths.get("src/main/resources/images")), is(true));
    }

    @Test
    // the-iron-yard-logo.png in src/main/resources/images
    public void tiyLogoInImagesFolderTest(){
        assertThat("the-iron-yard-logo.png is not in the src/main/resources/images",
                Files.exists(Paths.get("src/main/resources/images/the-iron-yard-logo.png")), is(true));
    }

    @Test
    // the-iron-yard-logo.png not in root
    public void tiyLogoNotInRoot(){
        assertThat("the-iron-yard-logo.png is not in the src/main/resources/images",
                Files.exists(Paths.get("the-iron-yard-logo.png")), is(false));
    }

    @Test
    // src/main/resources/deleteMe.txt is deleted
    public void deleteMeTxtIsDeletedTest(){
        assertThat("src/main/resources/deleteMe.txt is not deleted",
                Files.exists(Paths.get("src/main/resources/deleteMe.txt")), is(false));
    }

    @Test
    // example folder is deleted
    public void exampleFolderDeletedTest(){
        assertThat("example folder is not deleted",
                Files.exists(Paths.get("example")), is(false));
    }

    @Test
    // create a new file fruit.txt
    public void fruitTxtExistsTest(){
        assertThat("fruit.txt does not exist",
                Files.exists(Paths.get("fruit.txt")), is(true));
    }

    @Test
    // fruit.txt contains "apples, oranges, hot dogs, grapes, peaches"
    public void fruitContainsCorrectTextTest() throws IOException {
        assertThat("fruit.txt does not contain the correct list of fruit",
                new String(Files.readAllBytes(Paths.get("fruit.txt"))).trim(),
                is("apples, oranges, hot dogs, grapes, peaches"));
    }

    @Test
    // misspellllled.txt is misspelled
    public void misspellllledTxtRenamedTest(){
        assertThat("misspellllled.txt not renamed to misspelled.txt",
                !Files.exists(Paths.get("misspellllled.txt")) && Files.exists(Paths.get("misspelled.txt")),
                is(true));
    }
}
