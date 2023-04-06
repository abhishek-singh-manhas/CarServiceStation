package service;

public class Service {
    private String code;
    private String name;
    private double hatchbackPrice;
    private double sedanPrice;
    private double suvPrice;

    public Service(String code, String name, double hatchbackPrice, double sedanPrice, double suvPrice) {
        this.code = code;
        this.name = name;
        this.hatchbackPrice = hatchbackPrice;
        this.sedanPrice = sedanPrice;
        this.suvPrice = suvPrice;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public double getHatchbackPrice() {
        return hatchbackPrice;
    }

    public double getSedanPrice() {
        return sedanPrice;
    }

    public double getSuvPrice() {
        return suvPrice;
    }
}