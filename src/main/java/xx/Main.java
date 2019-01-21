package xx;

/**
 * @author Sidney 2018-12-27.
 */
public class Main {
    private static volatile Main instance;

    private Main(){

    }

    public Main getObject(){
        if (instance == null) {
            synchronized (Main.class) {
                if (instance == null) {
                    instance = new Main();
                }
            }
        }
        return instance;
    }
}

