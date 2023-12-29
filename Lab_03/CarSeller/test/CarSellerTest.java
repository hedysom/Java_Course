import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarSellerTest {
    @Test
    public void testModelSearch(){
        CarSeller concessionaria = new CarSeller();
        try {
            File file = Path.of("test/").resolve("testData.txt").toFile();
            concessionaria.readFile(file);
            ArrayList<Car> suitable= new ArrayList<Car>();
            suitable = concessionaria.ModelSearch("Tesla", "Model Y");
            Assert.assertEquals(2,suitable.size(),0);

        }catch (FileNotFoundException e){
            throw new RuntimeException(e);
        }


    }
    @Test
    public void testSearchByYear(){
        CarSeller concessionaria = new CarSeller();
        try {
            File file = new File("test"+File.separator+"testData.txt");
            //File file = Path.of("test/").resolve("testData.txt").toFile();
            concessionaria.readFile(file);
            ArrayList<Car> suitable= new ArrayList<Car>();
            suitable = concessionaria.ModelSearchByYear("Fiat", "Punto", 2004);
            Assert.assertEquals(1,suitable.size(),0);

        }catch (FileNotFoundException e){
            throw new RuntimeException(e);
        }


    }
}