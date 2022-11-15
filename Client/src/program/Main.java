package program;

import controller.Controller;

/**
 *
 * @author David Ugalde
 */
public class Main {
    public static void main(String[] args) {
        
        initApp();
    }

    private static void initApp(){        
         
        Controller controller = new Controller("127.0.0.1");
        Thread startServer = new Thread(controller);
        startServer.start();
    }
}
