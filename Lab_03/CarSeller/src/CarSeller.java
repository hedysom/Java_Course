import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarSeller {
    private final List<Car> cars;

    public CarSeller() {
        this.cars = new ArrayList<>();
    }

    public void readFile(File archive) throws FileNotFoundException{
        Scanner in = new Scanner(archive);
        while(in.hasNext()){
            String manufacturer = in.nextLine();
            String model = in.nextLine();
            int year = Integer.parseInt(in.nextLine());
            double price = Double.parseDouble(in.nextLine());
            Car car = new Car(manufacturer, model, year, price);
            cars.add(car);
        }

    }

    public ArrayList<Car> ModelSearch(String manufacturer, String model){
    ArrayList<Car> suitable = new ArrayList<>();
        for(Car car: cars) {
            if (car.getModel().equalsIgnoreCase(model) && car.getBrand().equalsIgnoreCase(manufacturer))
                suitable.add(car);
        }
        return suitable;
    }
    public ArrayList<Car> ModelSearchByYear(String manufacturer, String model, int year){
        ArrayList<Car> suitable = new ArrayList<>();
        for(Car car: cars){
            if(car.getModel().equalsIgnoreCase(model) &&
                    car.getBrand().equalsIgnoreCase(manufacturer) &&
                    (car.getManufacturingYear() == year))
                        suitable.add(car);

        }
        return suitable;
    }

    public ArrayList<Car> ModelSearchByYear(String manufacturer, String model, int year, double highPrice, double lowPrice){
        ArrayList<Car> suitable = new ArrayList<>();
        for(Car car: cars){
            if(car.getModel().equalsIgnoreCase(model) &&
                    car.getBrand().equalsIgnoreCase(manufacturer) &&
                    (car.getManufacturingYear() == year) &&
                    car.getPrice() >= lowPrice &&
                    car.getPrice() <= highPrice)
                        suitable.add(car);
        }
        return suitable;
    }
}
