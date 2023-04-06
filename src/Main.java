import java.util.ArrayList;

import bill.Bill;
import enums.Car;
import service.Service;
import CarServiceStation.CarServiceStation;
class Main {
    public static void main(String[] args) {
        CarServiceStation station = new CarServiceStation();

        // Adding services
        station.addService(new Service("BS01", "Basic Servicing", 2000, 4000, 5000));
        station.addService(new Service("EF01", "Engine Fixing", 5000, 8000, 10000));
        station.addService(new Service("CF01", "Clutch Fixing", 2000, 4000, 6000));
        station.addService(new Service("BF01", "Brake Fixing", 1000, 1500, 2500));
        station.addService(new Service("GF01", "Gear Fixing", 3000, 6000, 8000));

        // Adding cars
        station.addCar(new Car(Car.Type.HATCHBACK));
        station.addCar(new Car(Car.Type.SEDAN));
        station.addCar(new Car(Car.Type.SUV));

        // Generating bill
        Car car = station.getCars().get(0);
        ArrayList<Service> services = new ArrayList<>();
        services.add(station.getServices().get(0));
        services.add(station.getServices().get(1));
        Bill bill = station.generateBill(car, services);

        // Printing bill details
    }
}

