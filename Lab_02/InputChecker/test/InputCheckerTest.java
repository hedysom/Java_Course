import org.junit.Assert;
import org.junit.Test;



public class InputCheckerTest {
    @Test
    public void checkerTestOK(){
        InputChecker inputChecker = new InputChecker();
        Assert.assertEquals("OK", inputChecker.checkInput("S"));
        Assert.assertEquals("OK", inputChecker.checkInput("SI"));
        Assert.assertEquals("OK", inputChecker.checkInput("OK"));
        Assert.assertEquals("OK", inputChecker.checkInput("certo"));
        Assert.assertEquals("OK", inputChecker.checkInput("perchè no?"));
    }

    @Test
    public void checkerTestFine(){
        InputChecker inputChecker = new InputChecker();
        Assert.assertEquals("Fine", inputChecker.checkInput("No"));
        Assert.assertEquals("Fine", inputChecker.checkInput("N"));
    }

    @Test
    public void checkerTestDefault(){
        InputChecker inputChecker = new InputChecker();
        Assert.assertEquals("Dato non corretto", inputChecker.checkInput("roba a caso"));
        Assert.assertEquals("Dato non corretto", inputChecker.checkInput("altra roba a caso"));
    }

}