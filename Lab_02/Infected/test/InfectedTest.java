import org.junit.Assert;
import org.junit.Test;

public class InfectedTest {
    @Test
    public void testDisease(){
        Infected ebola = new Infected("ebola");
        Assert.assertEquals("ebola", ebola.getDisease());
        Assert.assertEquals(0,ebola.getNumberOfInfected(), 0);
    }

    @Test
    public void testDiseaseAndNumber(){
        Infected covid = new Infected("covid19", 1200);
        Assert.assertEquals("covid19", covid.getDisease());
        Assert.assertEquals(1200,covid.getNumberOfInfected(),0);
        covid.addInfected(200);
        Assert.assertEquals(1400,covid.getNumberOfInfected(),0);
    }
    @Test
    public void testRt(){
        Infected covid = new Infected("covid19", 1000);
        covid.updateInfectedByRt(1.1);
        Assert.assertEquals(1100,covid.getNumberOfInfected(),0);
        covid.updateInfectedByRt(0.8);
        Assert.assertEquals(880, covid.getNumberOfInfected(),0);
    }
}