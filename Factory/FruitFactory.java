package Factory;

/**
 * Created by afp on 10/08/16.
 */
public class FruitFactory {

    public Fruit createObject(String jenis){
        Fruit fruit;

        switch (jenis){
            case "a":
                fruit = new Apel("Apel dari Factory");
                break;

            case "r":
                fruit = new Rambutan("Rambutan dari Factory");
                break;

            case "s":
                fruit = new Semangka("Semangka dari Factory");
                break;

            default:
                fruit = null;

        }

        return fruit;
    }
}
