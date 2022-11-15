package program;

import controller.Controller;
import java.io.IOException;

/**
 *
 * @author David Ugalde
 */
public class Main {
    public static void main(String[] args) {
        
        initApp();
    }

    private static void initApp(){
        try {
            Controller controller = new Controller();
            
            Thread startServer = new Thread(controller);
	    startServer.start();
        } catch (IOException ex) {
              ex.printStackTrace();
        }
    }
}
