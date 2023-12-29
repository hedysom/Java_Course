package it.unisa.country;

import org.junit.Assert;
import org.junit.Test;

public class DataSetTest {
    @Test
    public void testMinimum() {
        Country italia = new Country("Italia", 2004);
        Country ucraina = new Country("Ucraina", 6000);
        DataSet dataSet = new DataSet();
        dataSet.add(italia);
        dataSet.add(ucraina);
        Assert.assertEquals(2004, dataSet.getMinimum().getSurfaceArea(), 0);
    }

    @Test
    public void testMaximum() {
        Country italia = new Country("Italia", 2004);
        Country ucraina = new Country("Ucraina", 6000);
        DataSet dataSet = new DataSet();
        dataSet.add(italia);
        dataSet.add(ucraina);
        Assert.assertEquals(6000, dataSet.getMaximum().getSurfaceArea(), 0);
    }
}