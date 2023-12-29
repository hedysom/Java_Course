package it.unisa.company;

public class Manager extends Employee {

    private String expertiseArea;
    private int workedHours;

    public Manager(String name, String lastName, String jobTitle, float hourlyWage, String expertiseArea){
        super(name, lastName, jobTitle, hourlyWage);
        this.setExpertiseArea(expertiseArea);
    }

    public String getExpertiseArea() {
        return expertiseArea;
    }

    public void setExpertiseArea(String expertiseArea) {
        this.expertiseArea = expertiseArea;
    }

    public int getWorkedHours() {
        return workedHours;
    }

    public void setWorkedHours(int workedHours){
        this.workedHours = workedHours;
        super.setWage(workedHours*this.getHourlyWage());
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Area di competenza='s" + expertiseArea + '\'';
    }
}
