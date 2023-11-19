import org.junit.Assert;
import org.junit.Test;

public class CarTest {
    @Test
    public void testCar(){
        Car audi = new Car(0.05);
        Assert.assertEquals(0, audi.getGas(), 0);
        audi.addGas(5);
        Assert.assertEquals(5, audi.getGas(),0);
    }

    @Test
    public void testDrive(){
        Car audi = new Car(0.05);
        audi.addGas(5);
        audi.drive(80);
        Assert.assertEquals(1,audi.getGas(),0);
    }
}