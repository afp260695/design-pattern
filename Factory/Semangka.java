package Factory;

/**
 * Created by afp on 10/08/16.
 */
public class Semangka extends Fruit{

    Semangka(String nama){
        setNama(nama);
    }

    @Override
    public void sebutkanJenis() {
        System.out.println("Ini Semangka");
    }
}
