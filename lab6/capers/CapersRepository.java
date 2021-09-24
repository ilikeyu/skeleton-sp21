package capers;

import java.io.File;
import java.io.IOException;

import static capers.Utils.*;

/**
 * A repository for Capers
 *
 * @author TODO
 * The structure of a Capers Repository is as follows:
 * <p>
 * .capers/ -- top level folder for all persistent data in your lab12 folder
 * - dogs/ -- folder containing all of the persistent data for dogs
 * - story -- file containing the current story
 * <p>
 * TODO: change the above structure if you do something different.
 */
public class CapersRepository {
    /**
     * Current Working Directory.
     */
    static final File CWD = new File(System.getProperty("user.dir"));

    /**
     * Main metadata folder.
     */
    static final File CAPERS_FOLDER = Utils.join(CWD,  ".capers"); // TODO Hint: look at the `join`
    //      function in Utils

    /**
     * Does required filesystem operations to allow for persistence.
     * (creates any necessary folders or files)
     * Remember: recommended structure (you do not have to follow):
     * <p>
     * .capers/ -- top level folder for all persistent data in your lab12 folder
     * - dogs/ -- folder containing all of the persistent data for dogs
     * - story -- file containing the current story
     */
    public static void setupPersistence() {
        // TODO
        if (!CAPERS_FOLDER.exists()) CAPERS_FOLDER.mkdir();
        File dogs = Utils.join(CAPERS_FOLDER,"dogs");
        if (!dogs.exists()) dogs.mkdir();
        File story = Utils.join(CAPERS_FOLDER,"story");
        if (!story.exists()) {
            try {
                story.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * Appends the first non-command argument in args
     * to a file called `story` in the .capers directory.
     *
     * @param text String of the text to be appended to the story
     */
    public static void writeStory(String text) {
//        System.out.println(CWD.getPath());
//        System.out.println(CAPERS_FOLDER.getPath());
        // TODO
//        System.out.println(CAPERS_FOLDER.exists());
        File story = join(CAPERS_FOLDER, "story");
        String oldStory = "";
        if (story.exists()) {
            oldStory = Utils.readContentsAsString(story);
        }
        System.out.println(oldStory + text);
        Utils.writeContents(story, oldStory, text, System.lineSeparator());
    }

    /**
     * Creates and persistently saves a dog using the first
     * three non-command arguments of args (name, breed, age).
     * Also prints out the dog's information using toString().
     */
    public static void makeDog(String name, String breed, int age) {
        // TODO
        Dog dog = new Dog(name, breed, age);
        System.out.println(dog);
        dog.saveDog();
    }

    /**
     * Advances a dog's age persistently and prints out a celebratory message.
     * Also prints out the dog's information using toString().
     * Chooses dog to advance based on the first non-command argument of args.
     *
     * @param name String name of the Dog whose birthday we're celebrating.
     */
    public static void celebrateBirthday(String name) {
        // TODO
        Dog birthDog = Dog.fromFile(name);
        birthDog.haveBirthday();
        birthDog.saveDog();
    }
}
