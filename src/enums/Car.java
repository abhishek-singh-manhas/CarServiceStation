package enums;
public class Car {
    public enum Type { HATCHBACK, SEDAN, SUV }

    public Type type;

    public Car(Type type) {
        this.type = type;
    }

    public Type getType() {
        return type;
    }
}