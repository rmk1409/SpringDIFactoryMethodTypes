package nonstaticfactory;

/**
 * Created by Roma on 16.09.2016.
 */
public class Factory {
    public Eatable getFood(){
        return new Pizza();
    }
}
