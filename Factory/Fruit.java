package Factory;

/**
 * Created by afp on 10/08/16.
 */
public abstract class Fruit {
    protected String nama;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public abstract void sebutkanJenis();
}
