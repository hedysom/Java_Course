package it.unisa.school;

public class Professor extends Person {

    private final String specilizzation;

    private double salary;

    public Professor(String name, String lastName, int birthYear, String specilizzation, double salary){
        super(name, lastName, birthYear);
        this.specilizzation = specilizzation;
        this.salary=salary;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Argomento='" + specilizzation + '\'' +
                ", Stipendio=" + salary;
    }
}
