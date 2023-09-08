package ro.fasttrackit.exercise1;

public class Fridge extends Electronics {

    int temperature;

    public Fridge(double price, String name, String description, int quantity, int length, int width, int height, int weight, int temperature) {
        super(price, name, description, quantity, length, width, height, weight);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "Fridge{" +
                "temperature=" + temperature +
                ", length=" + length +
                ", width=" + width +
                ", height=" + height +
                ", weight=" + weight +
                ", price=" + price +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
