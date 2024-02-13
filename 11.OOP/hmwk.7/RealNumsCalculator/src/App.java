import java.util.logging.*;

import controller.CalculatorController;

public class App {
    private static final Logger logger = Logger.getLogger(App.class.getName());

    public static void main(String[] args) {
        try {
            logger.setUseParentHandlers(false);
            FileHandler fh = new FileHandler("log.txt");
            logger.addHandler(fh);
            SimpleFormatter sFormatter = new SimpleFormatter();
            fh.setFormatter(sFormatter);
            logger.info("Starting the app");

            CalculatorController cc = new CalculatorController();
            cc.createTask();
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Error starting the app", e);
        } 
        
    }
}
