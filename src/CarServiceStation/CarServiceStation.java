package CarServiceStation;

import bill.Bill;
import enums.Car;
import service.Service;

import java.util.ArrayList;

public class CarServiceStation {

    private ArrayList<Car> cars;
    private ArrayList<Service> services;

    public CarServiceStation() {
        cars = new ArrayList<>();
        services = new ArrayList<>();
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public void addService(Service service) {
        services.add(service);
    }

    public ArrayList<Service> getServices() {
        return services;
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public Bill generateBill(Car car, ArrayList<Service> serviceList) {
        Bill bill = new Bill(car);
        double total = 0;
        for (Service service : serviceList) {
            double price = 0;
            switch (car.getType()) {
                case HATCHBACK:
                    price = service.getHatchbackPrice();
                    break;
                case SEDAN:
                    price = service.getSedanPrice();
                    break;
                case SUV:
                    price = service.getSuvPrice();
                    break;
            }
            bill.addService(service, price);
            total += price;
        }
        bill.setTotal(total);
        if (total > 10000) {
            bill.setComplimentaryCleaning(true);
        }
        return bill;
    }
}