package it.unisa.quiz;

public class Quiz implements Measurable {

    private final double grade;

    public Quiz(double grade){
        this.grade = grade;
    }

    @Override
    public double getMeasure() {
        return grade;
    }
}
