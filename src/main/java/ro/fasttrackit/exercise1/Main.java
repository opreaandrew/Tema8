package ro.fasttrackit.exercise1;

public class Main {
    public static void main(String[] args) {
        Product iceBox = new Fridge(99.99, "Arctic", "2 usi", 5, 2, 2, 3, 40, -25);
        Product xBox = new Electronics(50, "xBox", "2 controller kit", 2, 1,1,1,1);
        Product lipStick = new Cosmetics(1.4, "Maybeline", "Baboon red", 9, "red", 0.2);
        Product ring = new Product(90, "Wedding ring", "family heirloom",99);

        System.out.println(iceBox);
        System.out.println(xBox);
        System.out.println(lipStick);
        System.out.println(ring);
    }
}
