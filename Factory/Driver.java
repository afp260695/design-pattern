package Factory;

import java.util.Scanner;

/**
 * Created by afp on 10/08/16.
 */
public class Driver {

    public static void main(String[] argv){
        Scanner scanner = new Scanner(System.in);
        FruitFactory fruitFactory = new FruitFactory();
        String jenis;

        System.out.println("Masukkan jenis (a/r/s): ");
        jenis = scanner.next();

        Fruit fruit = fruitFactory.createObject(jenis);

        if(fruit == null) {
            System.out.println("Masukan anda salah");
        }else{
            fruit.sebutkanJenis();
            System.out.println(fruit.getNama());
        }

    }
}
