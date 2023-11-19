import org.junit.Assert;
import org.junit.Test;

public class VendingMachineTest {
  @Test
    public void testAddCansTakeCanTakeTokens() {
    VendingMachine cocaCola = new VendingMachine(100);
    cocaCola.addCans(10);
    for (int i = 0; i < 10; i++) {
      cocaCola.takeCan();
    }
    Assert.assertEquals(100, cocaCola.getNumberOfCans(), 0);
    Assert.assertEquals(10, cocaCola.getNumberOfTokens(), 0);

    cocaCola.takeTokens();
    Assert.assertEquals(0, cocaCola.getNumberOfTokens(), 0);
  }
}


