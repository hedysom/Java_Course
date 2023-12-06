package it.unisa.school;

public class Student extends Person{

    private int numberOfAbsences= 0;

    public void addAbsence(){
        numberOfAbsences++;
    }

    public void removeAbsence(){
        numberOfAbsences--;
    }

    public Student(String name, String lastName, int birthDate, int numberOfAbsences){
        super(name, lastName, birthDate);
        this.numberOfAbsences=numberOfAbsences;
    }
    @Override
    public String toString() {
        return super.toString() +
                ", Numero di assenze=" + numberOfAbsences;
    }
}
