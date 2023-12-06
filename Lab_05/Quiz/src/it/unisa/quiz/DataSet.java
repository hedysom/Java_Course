package it.unisa.quiz;

public class DataSet {

    private double sum;
    private Measurable minimum;
    private Measurable maximum;
    private int count;

    public DataSet() {
        sum = 0;
        minimum = null;
        maximum = null;
        count = 0;
    }

    public double getAverage() {
        if(count!=0)
            return sum/count;
        return 0;
    }

    public Measurable getMaximum() {
            return maximum;
    }

    public Measurable getMinimum() {
        return minimum;
    }

    public void add(Measurable x) {
       sum += x.getMeasure();
       if( minimum == null || minimum.getMeasure() > x.getMeasure())
           minimum = x;
       if( maximum == null || maximum.getMeasure() < x.getMeasure())
            maximum = x;
       count++;
    }
}