package staticfactory;

/**
 * Created by Roma on 16.09.2016.
 */
public class Factory {
    public static Driveable getCar() {
        return new Tesla();
    }

    public static Flyable getPlane() {
        return new Fighter();
    }
}
