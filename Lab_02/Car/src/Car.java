public class Car {
    private double gas;
    private final double consumptionRate;

    public Car(double consumptionRate){
        this.gas = 0;
        this.consumptionRate = consumptionRate;
    }

    public double getGas() {
        return gas;
    }

    public void addGas(double gas) {
        this.gas += gas;
    }

    public void drive(double km) {
        if (gas > 0) {
            gas -= consumptionRate * km;
        } else
            System.out.println("Hai finisto il carburante!");
        if (gas < 0) {
            System.out.println("Hai finisto il carburante!");
            gas = 0;
        }
    }

}