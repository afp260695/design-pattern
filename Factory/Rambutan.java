package Factory;

/**
 * Created by afp on 10/08/16.
 */
public class Rambutan extends Fruit {

    Rambutan(String nama){
        setNama(nama);
    }


    @Override
    public void sebutkanJenis() {
        System.out.println("Ini Rambutan");
    }
}
