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

> $ gradle test --info<br />
> Starting Build<br />
> Settings evaluated using settings file '/Users/doug/Scratch/tiy-homework-command-line-practice/settings.gradle'.<br />
> Projects loaded. Root project using build file '/Users/doug/Scratch/tiy-homework-command-line-practice/build.gradle'.<br />
> Included projects: [root project 'commandLinePractice']<br />
> Evaluating root project 'commandLinePractice' using build file '/Users/doug/Scratch/tiy-homework-command-line-practice/build.gradle'.<br />
> All projects evaluated.<br />
> Selected primary task 'test' from project :<br />
> Tasks to be executed: [task ':compileJava', task ':processResources', task ':classes', task ':compileTestJava', task ':processTestResources', task ':testClasses', task ':test']<br />
> :compileJava (Thread[main,5,main]) started.<br />
> :compileJava<br />
> Skipping task ':compileJava' as it has no source files.<br />
> :compileJava UP-TO-DATE<br />
> :compileJava (Thread[main,5,main]) completed. Took 0.048 secs.<br />
> :processResources (Thread[main,5,main]) started.<br />
> :processResources<br />
> Skipping task ':processResources' as it is up-to-date (took 0.066 secs).<br />
> :processResources UP-TO-DATE<br />
> :processResources (Thread[main,5,main]) completed. Took 0.073 secs.<br />
> :classes (Thread[main,5,main]) started.<br />
> :classes<br />
> Skipping task ':classes' as it has no actions.<br />
> :classes UP-TO-DATE<br />
> :classes (Thread[main,5,main]) completed. Took 0.001 secs.<br />
> :compileTestJava (Thread[main,5,main]) started.<br />
> :compileTestJava<br />
> Skipping task ':compileTestJava' as it is up-to-date (took 0.425 secs).<br />
> :compileTestJava UP-TO-DATE<br />
> :compileTestJava (Thread[main,5,main]) completed. Took 0.442 secs.<br />
> :processTestResources (Thread[main,5,main]) started.<br />
> :processTestResources<br />
> Skipping task ':processTestResources' as it has no source files.<br />
> :processTestResources UP-TO-DATE<br />
> :processTestResources (Thread[main,5,main]) completed. Took 0.001 secs.<br />
> :testClasses (Thread[main,5,main]) started.<br />
> :testClasses<br />
> Skipping task ':testClasses' as it has no actions.<br />
> :testClasses UP-TO-DATE<br />
> :testClasses (Thread[main,5,main]) completed. Took 0.003 secs.<br />
> :test (Thread[main,5,main]) started.<br />
> :test<br />
> Executing task ':test' (up-to-date check took 0.057 secs) due to:<br />
> &nbsp;&nbsp;No history is available.<br />
> Starting process 'Gradle Test Executor 1'. Working directory: /Users/doug/Scratch/tiy-homework-command-line-practice Command: /Library/Java/JavaVirtualMachines/jdk1.8.0_91.jdk/Contents/Home/bin/java -Djava.security.manager=jarjar.org.gradle.process.internal.child.BootstrapSecurityManager -Dfile.encoding=UTF-8 -Duser.country=US -Duser.language=en -Duser.variant -ea -cp /Users/doug/.gradle/caches/2.11/workerMain/gradle-worker.jar jarjar.org.gradle.process.internal.launcher.GradleWorkerMain 'Gradle Test Executor 1'<br />
> Successfully started process 'Gradle Test Executor 1'<br />
> Gradle Test Executor 1 started executing tests.<br />
> Gradle Test Executor 1 finished executing tests.<br />
> <br />
> CommandLineTest > deleteMeTxtIsDeletedTest FAILED<br />
> &nbsp;&nbsp;&nbsp; java.lang.AssertionError: src/main/resources/deleteMe.txt is not deleted<br />
> &nbsp;&nbsp;&nbsp; Expected: is <false><br />
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;but: was <true><br />
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;at org.hamcrest.MatcherAssert.assertThat(MatcherAssert.java:20)<br />
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;at CommandLineTest.deleteMeTxtIsDeletedTest(CommandLineTest.java:57)<br />
> <br />
> CommandLineTest > imageFolderIsAFolderTest FAILED<br />
> &nbsp;&nbsp;&nbsp; java.lang.AssertionError: src/main/resources/images folder is not a folder<br />
> &nbsp;&nbsp;&nbsp; Expected: is <true><br />
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;but: was <false><br />
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;at org.hamcrest.MatcherAssert.assertThat(MatcherAssert.java:20)<br />
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;at CommandLineTest.imageFolderIsAFolderTest(CommandLineTest.java:36)<br />
> <br />
> CommandLineTest > fruitContainsCorrectTextTest FAILED<br />
> &nbsp;&nbsp;&nbsp; java.nio.file.NoSuchFileException: fruit.txt<br />
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;at sun.nio.fs.UnixException.translateToIOException(UnixException.java:86)<br />
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;at sun.nio.fs.UnixException.rethrowAsIOException(UnixException.java:102)<br />
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;at sun.nio.fs.UnixException.rethrowAsIOException(UnixException.java:107)<br />
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;at sun.nio.fs.UnixFileSystemProvider.newByteChannel(UnixFileSystemProvider.java:214)<br />
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;at java.nio.file.Files.newByteChannel(Files.java:361)<br />
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;at java.nio.file.Files.newByteChannel(Files.java:407)<br />
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;at java.nio.file.Files.readAllBytes(Files.java:3152)<br />
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;at CommandLineTest.fruitContainsCorrectTextTest(CommandLineTest.java:79)<br />
> <br />
> CommandLineTest > exampleFolderDeletedTest FAILED<br />
> &nbsp;&nbsp;&nbsp; java.lang.AssertionError: example folder is not deleted<br />
> &nbsp;&nbsp;&nbsp; Expected: is <false><br />
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;but: was <true><br />
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;at org.hamcrest.MatcherAssert.assertThat(MatcherAssert.java:20)<br />
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;at CommandLineTest.exampleFolderDeletedTest(CommandLineTest.java:64)<br />
> <br />
> CommandLineTest > misspellllledTxtRenamedTest FAILED<br />
> &nbsp;&nbsp;&nbsp; java.lang.AssertionError: misspellllled.txt not renamed to misspelled.txt<br />
> &nbsp;&nbsp;&nbsp; Expected: is <true><br />
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;but: was <false><br />
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;at org.hamcrest.MatcherAssert.assertThat(MatcherAssert.java:20)<br />
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;at CommandLineTest.misspellllledTxtRenamedTest(CommandLineTest.java:86)<br />
> <br />
> CommandLineTest > renameMainTest FAILED<br />
> &nbsp;&nbsp;&nbsp; java.lang.AssertionError: Didn't rename Main.java to Main.java<br />
> &nbsp;&nbsp;&nbsp; Expected: is <true><br />
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;but: was <false><br />
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;at org.hamcrest.MatcherAssert.assertThat(MatcherAssert.java:20)<br />
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;at CommandLineTest.renameMainTest(CommandLineTest.java:15)<br />
> <br />
> CommandLineTest > tiyLogoInImagesFolderTest FAILED<br />
> &nbsp;&nbsp;&nbsp; java.lang.AssertionError: the-iron-yard-logo.png is not in the src/main/resources/images<br />
> &nbsp;&nbsp;&nbsp; Expected: is <true><br />
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;but: was <false><br />
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;at org.hamcrest.MatcherAssert.assertThat(MatcherAssert.java:20)<br />
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;at CommandLineTest.tiyLogoInImagesFolderTest(CommandLineTest.java:43)<br />
> <br />
> CommandLineTest > mainWasRunTest FAILED<br />
> &nbsp;&nbsp;&nbsp; java.lang.AssertionError: Didn't run 'gradle -run'<br />
> &nbsp;&nbsp;&nbsp; Expected: is <true><br />
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;but: was <false><br />
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;at org.hamcrest.MatcherAssert.assertThat(MatcherAssert.java:20)<br />
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;at CommandLineTest.mainWasRunTest(CommandLineTest.java:22)<br />
> <br />
> CommandLineTest > fruitTxtExistsTest FAILED<br />
> &nbsp;&nbsp;&nbsp; java.lang.AssertionError: fruit.txt does not exist<br />
> &nbsp;&nbsp;&nbsp; Expected: is <true><br />
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;but: was <false><br />
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;at org.hamcrest.MatcherAssert.assertThat(MatcherAssert.java:20)<br />
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;at CommandLineTest.fruitTxtExistsTest(CommandLineTest.java:71)<br />
> <br />
> CommandLineTest > imageFolderCreatedTest FAILED<br />
> &nbsp;&nbsp;&nbsp; java.lang.AssertionError: Images folder was not created<br />
> &nbsp;&nbsp;&nbsp; Expected: is <true><br />
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;but: was <false><br />
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;at org.hamcrest.MatcherAssert.assertThat(MatcherAssert.java:20)<br />
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;at CommandLineTest.imageFolderCreatedTest(CommandLineTest.java:29)<br />
> <br />
> CommandLineTest > tiyLogoNotInRoot FAILED<br />
> &nbsp;&nbsp;&nbsp; java.lang.AssertionError: the-iron-yard-logo.png is not in the src/main/resources/images<br />
> &nbsp;&nbsp;&nbsp; Expected: is <false><br />
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;but: was <true><br />
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;at org.hamcrest.MatcherAssert.assertThat(MatcherAssert.java:20)<br />
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;at CommandLineTest.tiyLogoNotInRoot(CommandLineTest.java:50)<br />
> <br />
> 11 tests completed, 11 failed<br />
> Finished generating test XML results (0.034 secs) into: /Users/doug/Scratch/tiy-homework-command-line-practice/build/test-results<br />
> Generating HTML test report...<br />
> Finished generating test html results (0.034 secs) into: /Users/doug/Scratch/tiy-homework-command-line-practice/build/reports/tests<br />
> :test FAILED<br />
> :test (Thread[main,5,main]) completed. Took 1.598 secs.<br />
> <br />
> FAILURE: Build failed with an exception.<br />
> <br />
> * What went wrong:<br />
> Execution failed for task ':test'.<br />
> > There were failing tests. See the report at: file:///Users/doug/Scratch/tiy-homework-command-line-practice/build/reports/tests/index.html<br />
> <br />
> * Try:<br />
> Run with --stacktrace option to get the stack trace. Run with --debug option to get more log output.<br />
> <br />
> BUILD FAILED<br />
> <br />
> Total time: 5.828 secs<br />
> Stopped 0 compiler daemon(s).

This output shows us that 11 tests were run, but all 11 failed. You can rerun the tests as often as you would like while you work through the homework. You have completed the homework successfully when all tests pass. Follow these instructions to make the tests pass:

1. There is a file named `main.txt` in the folder `src/main/java/`. This file must be renamed to `Main.java`.

2. Now that you've correctly renamed the Main.java file you can to run it using `gradle run -q` in the root directory of the project. This will print out a friendly message and create a new file named `mainWasRun.txt` in the root of your project.

3. Create a new folder named `images` in the folder `src/main/resources`.

4. There is a file in the root of the project named `the-iron-yard-logo.png`. This must be moved into the `images` folder you just created in `src/main/resources`.

5. There is a file named `deleteMe.txt` in the `src/main/resources` folder. This must be deleted.

6. There is a folder named `example` in the root of the project. This must be deleted.

7. Create a new file in the root of the project named `fruit.txt`. Using the command line, put the following text into the file:

	> apples, oranges, hot dogs, grapes, peaches

8. There is a file named `misspellllled.txt` in the root of the project. Rename it to `misspelled.txt`.

Once all of the tests are passing use Git to commit the changes you made and push them to your Github repository.

Finally, **_submit the SSH url_** of your repository as the submission for this assignment.


