import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BankTest {

    @Before
    public void setup() {
        BankAccount.totalNumberOfAccounts = 0;
    }

    @Test
    public void findAccountTest() {
        Bank b = new Bank();
        b.addAccount(1000, "Dario");
        BankAccount newAccount = b.find(1);
        Assert.assertEquals(1, newAccount.getAccountNumber());
        Assert.assertEquals(1000, newAccount.getBalance(), 0);
        Assert.assertEquals("Dario", newAccount.getCustomerName());
    }

    @Test
    public void depositTest() {
        Bank b = new Bank();
        b.addAccount(100, "Eugenio");
        BankAccount account = b.find(1);
        Assert.assertEquals(1,account.getAccountNumber(), 0);
        account.deposit(100);
        Assert.assertEquals(200, account.getBalance(),0);
    }

    @Test
    public void withdrawTest() {
        Bank b = new Bank();
        b.addAccount(100, "Eugenio");
        BankAccount account = b.find(1);
        account.withdraw(100);
        Assert.assertEquals(0, account.getBalance(),0);
    }

    @Test
    public void transferTest() {
        Bank b = new Bank();
        b.addAccount(100, "Eugenio");
        BankAccount accountEugenio = b.find(1);
        b.addAccount(100, "Dario");
        BankAccount accountDario = b.find(2);

        b.transfer(1,2,100);
        Assert.assertEquals(200, accountDario.getBalance(),0);
        Assert.assertEquals(0,accountEugenio.getBalance(),0);

        b.transfer(2,1,200);
        Assert.assertEquals(200, accountEugenio.getBalance(),0);
        Assert.assertEquals(0, accountDario.getBalance(),0);
    }
}