package singleton;

/**
 * Created by Roma on 16.09.2016.
 */
public class Singleton {
    private static final Singleton instance = new Singleton();

    private Singleton(){}

    public static Singleton getInstance(){
        return instance;
    }
}
