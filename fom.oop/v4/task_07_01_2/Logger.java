package fom.oop.v4.task_07_01_2;

public class Logger {

    private static Logger logger;

    private Logger() {
        System.out.println("## In Logger constructor ##");
    }

    public void log(String message) {
        System.out.println(message);
    }

    public static Logger getInstance() {
        if ( logger == null) {
            logger = new Logger();
        }
        return logger;
    }

}
