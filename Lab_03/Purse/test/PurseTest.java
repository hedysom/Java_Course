import com.sun.source.tree.AssertTree;
import org.junit.Assert;
import org.junit.Test;

public class PurseTest {

    @Test
    public void findTest() {
        Purse purse = new Purse();
        purse.add(Purse.dollar);
        Assert.assertTrue(purse.find(Purse.dollar));
        Assert.assertFalse(purse.find(Purse.dime));
    }

    @Test
    public void countTest() {
        Purse purse = new Purse();
        for(int i = 0; i<10; i++)
            purse.add(Purse.dollar);
        Assert.assertEquals(10, purse.count(Purse.dollar), 0);
        Assert.assertEquals(0,purse.count(Purse.dime), 0);
    }

    @Test
    public void minMaxTest() {
        Purse purse = new Purse();
        purse.add(Purse.dollar);
        purse.add(Purse.dime);
        purse.add(Purse.cent);

        Assert.assertEquals(Purse.dollar, purse.getMaximum());
        Assert.assertEquals(Purse.cent, purse.getMinimum());
    }

    @Test
    public void getTotalTest() {
        Purse purse = new Purse();
        for(int i = 0; i<10; i++) {
            purse.add(Purse.dollar);
            purse.add(Purse.dime);
        }
        Assert.assertEquals(11, purse.getTotal(), 0.01);
    }

    @Test
    public void addRemoveTest() {
        Purse purse = new Purse();
            purse.add(Purse.dollar);
        Assert.assertEquals(1,purse.getTotal(), 0);
            purse.remove(Purse.dollar);
        Assert.assertEquals(0, purse.getTotal(),0);
    }

    @Test
    public void hasCoinTest() {
        Purse purse = new Purse();
        purse.add(Purse.dollar);
        Assert.assertTrue(purse.hasCoin(Purse.dollar));
        Assert.assertFalse(purse.hasCoin(Purse.nickel));
    }

    @Test
    public void toStringTest() {
        Purse purse = new Purse();
        for(int i = 0; i<10; i++)
            purse.add(Purse.dollar);
        purse.add(Purse.quarter);
        Assert.assertEquals("Purse[Dollar = 10, Quarter = 1, Dime = 0, Nickel = 0, Cent = 0]", purse.toString());
    }

    @Test
    public void equalsTest() {
        Purse purse = new Purse();
        Purse o = new Purse();
        String o1 = "weee";
        Assert.assertEquals(purse, o);

        for(int i = 0; i<10; i++)
            purse.add(Purse.cent);


        Assert.assertNotEquals(purse, o);
        Assert.assertNotEquals(purse,o1);

        for(int i = 0; i<10; i++)
            o.add(Purse.cent);
        Assert.assertEquals(purse, o);
        Assert.assertNotEquals(purse,null);


    }
}