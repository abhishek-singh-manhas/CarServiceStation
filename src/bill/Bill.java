package bill;

import enums.Car;
import service.Service;

import java.util.ArrayList;

public class Bill {
    private Car car;
    private ArrayList<Service> services;
    private double total;
    private boolean complimentaryCleaning;

    public Bill(Car car) {
        this.car = car;
        services = new ArrayList<>();
    }

    public void addService(Service service, double price) {
        services.add(service);
        System.out.println("Added service: " + service.getName() + " for " + price);
    }

    public void setTotal(double total) {
        this.total = total;
        System.out.println("Total bill: " + total);
    }

    public void setComplimentaryCleaning(boolean complimentaryCleaning) {
        this.complimentaryCleaning = complimentaryCleaning;
        System.out.println("Complimentary cleaning provided.");
    }

    public Car getCar() {
        return car;
    }

    public ArrayList<Service> getServices() {
        return services;
    }

    public double getTotal() {
        return total;
    }

    public boolean isComplimentaryCleaning() {
        return complimentaryCleaning;
    }
}
