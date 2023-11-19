import org.junit.Assert;
import org.junit.Test;

public class LockerTest {
    @Test
    public void testLocok() {
        Locker locker = new Locker();
        Assert.assertTrue(locker.isOpen());
        locker.lock();
        Assert.assertFalse(locker.isOpen());
    }

    @Test
    public void testNewComb() {
        Locker locker = new Locker();
        locker.newComb("ABC");
        locker.lock();
        locker.unlock("ABC");
        Assert.assertTrue(locker.isOpen());
    }

    @Test
    public void testUnlock(){
        Locker locker = new Locker();
        locker.lock();
        locker.newComb("AAA");
        locker.unlock("BBB");
        Assert.assertFalse(locker.isOpen());
    }
}