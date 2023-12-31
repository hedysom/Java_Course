package it.unisa.quiz;

public class DataSet {

    private double sum;
    private Quiz minimum;
    private Quiz maximum;
    private int count;

    public DataSet() {
        count = 0;
        sum = 0;
        minimum = null;
        maximum = null;
    }

    public double getAverage() {
        if (count == 0) return 0;
        else return sum / count;
    }

    public Quiz getMaximum() {
        return maximum;
    }

    public Quiz getMinimum() {
        return minimum;
    }

    public void add(Quiz quiz) {
       sum += quiz.getMeasure();
       if ( (count == 0) || (minimum.compareTo(quiz)) > 0)
           minimum = quiz;

       if ( (count == 0) || (maximum.compareTo(quiz)) < 0)
           maximum = quiz;

       count++;
    }
}