import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Properties {

    public static Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    public static void main(String[] args) throws IOException {

        try {

            startEditor(getEditor());

        } catch (Exception exception) {
            System.err.println("Error " + exception.getMessage());
            System.exit(1);
        }
    }

    public static String getEditor() {

        AtomicReference<String> editor = new AtomicReference<>("");

        System.getenv().forEach((env, value) -> {
            if (value.startsWith("Win")) {
                logger.log(Level.INFO, String.format("env: %s value: %s", env, value));
                editor.set("notepad");
            } else if (value.toLowerCase().contains("max")) {
                logger.log(Level.INFO, String.format("env: %s value: %s", env, value));
                editor.set("notepad");
            }
        });

        return editor.getPlain();
    }

    public static void startEditor(String editor) throws Exception {

        Runtime runtime = Runtime.getRuntime();
        Process process;

        process = runtime.exec(editor);
        process.waitFor();

    }

    public static String getOperatingSystem() {

        AtomicReference<String> editor = new AtomicReference<>("");

        System.getenv().forEach((env, value) -> {
            logger.log(Level.INFO, String.format("env: %s value: %s", env, value));
        });

        return editor.getPlain();
    }


}
