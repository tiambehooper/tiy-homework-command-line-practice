# Command Line Practice

This assignment will help you practice using the command line.

## Instructions

Do all of the following in the terminal:

[Fork this repository](https://help.github.com/articles/fork-a-repo/) into your own Github account:
* https://github.com/dhughes/tiy-homework-command-line-practice

Open Terminal and navigate to your projects directory.

Clone the forked repository to your projects directory. This should create a new directory in your projects directory named `tiy-homework-command-line-practice`. 

Confirm that the `tiy-homework-command-line-practice` directory exists and navigate into it.

The project you cloned uses a tool called Gradle that you haven't been introduced to yet. We can use Gradle to test run and test this project at any time. Go ahead and test the project by running `gradle test --info`. You should see the output similar to this:

> $ gradle test<br />
> :compileJava UP-TO-DATE<br />
> :processResources<br />
> :classes<br />
> :compileTestJava<br />
> :processTestResources UP-TO-DATE<br />
> :testClasses<br />
> :test<br />
> <br />
> CommandLineTest > deleteMeTxtIsDeletedTest FAILED<br />
> &nbsp;&nbsp;&nbsp;java.lang.AssertionError at CommandLineTest.java:57<br />
> <br />
> CommandLineTest > imageFolderIsAFolderTest FAILED<br />
> &nbsp;&nbsp;&nbsp;java.lang.AssertionError at CommandLineTest.java:36<br />
> <br />
> CommandLineTest > fruitContainsCorrectTextTest FAILED<br />
> &nbsp;&nbsp;&nbsp;java.nio.file.NoSuchFileException at CommandLineTest.java:79<br />
> <br />
> CommandLineTest > exampleFolderDeletedTest FAILED<br />
> &nbsp;&nbsp;&nbsp;java.lang.AssertionError at CommandLineTest.java:64<br />
> <br />
> CommandLineTest > misspellllledTxtRenamedTest FAILED<br />
> &nbsp;&nbsp;&nbsp;java.lang.AssertionError at CommandLineTest.java:86<br />
> <br />
> CommandLineTest > renameMainTest FAILED<br />
> &nbsp;&nbsp;&nbsp;java.lang.AssertionError at CommandLineTest.java:15<br />
> <br />
> CommandLineTest > tiyLogoInImagesFolderTest FAILED<br />
> &nbsp;&nbsp;&nbsp;java.lang.AssertionError at CommandLineTest.java:43<br />
> <br />
> CommandLineTest > mainWasRunTest FAILED<br />
> &nbsp;&nbsp;&nbsp;java.lang.AssertionError at CommandLineTest.java:22<br />
> <br />
> CommandLineTest > fruitTxtExistsTest FAILED<br />
> &nbsp;&nbsp;&nbsp;java.lang.AssertionError at CommandLineTest.java:71<br />
> <br />
> CommandLineTest > imageFolderCreatedTest FAILED<br />
> &nbsp;&nbsp;&nbsp;java.lang.AssertionError at CommandLineTest.java:29<br />
> <br />
> CommandLineTest > tiyLogoNotInRoot FAILED<br />
> &nbsp;&nbsp;&nbsp;java.lang.AssertionError at CommandLineTest.java:50<br />
> <br />
> 11 tests completed, 11 failed<br />
> :test FAILED<br />
> <br />
> FAILURE: Build failed with an exception.<br />
> <br />
> * What went wrong:<br />
> Execution failed for task ':test'.<br />
> > There were failing tests. See the report at: file:///Users/doug/Scratch/tiy-homework-command-line-practice/build/reports/tests/index.html<br />
> <br />
> * Try:<br />
> Run with --stacktrace option to get the stack trace. Run with --info or --debug option to get more log output.<br />
> <br />
> BUILD FAILED<br />
> <br />
> Total time: 7.415 secs<br />

This output shows us that 11 tests were run, but all 11 failed. You can rerun the tests as often as you would like while you work through the homework. You have completed the homework successfully when all tests pass. Follow these instructions to make the tests pass:

1. There is a file named `main.txt` in the folder `src/main/java/`. This file must be renamed to `Main.java`.

2. Now that you've correctly renamed the Main.java file you can to run it using `gradle run -q`. This will print out a friendly message and create a new file named `mainWasRun.txt` in the root of your project.

3. Create a new folder named `images` in the folder `src/main/resources`.

4. There is a file in the root of the project named `the-iron-yard-logo.png`. This must be moved into the `images` folder you just created in `src/main/resources`.

5. There is a file named `deleteMe.txt` in the `src/main/resources` folder. This must be deleted.

6. There is a folder named `example` in the root of the project. This must be deleted.

7. Create a new file in the root of the project named `fruit.txt`. Using the command line, put the following text into the file:

	> apples, oranges, hot dogs, grapes, peaches

8. There is a file named `misspellllled.txt` in the root of the project. Rename it to `misspelled.txt`.

Once all of the tests are passing use Git to commit the changes you made and push them to your Github repository.

Finally, **_submit the SSH url_** of your repository as the submission for this assignment.


