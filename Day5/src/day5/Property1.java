package day5;

import java.util.*;
import java.util.function.Predicate;
import java.util.function.Consumer;

public class Property1 {
    static List<Property> properties = new ArrayList<>();

    // Inner class to represent a Property
    static class Property {
        private String address;
        private double price;
        private int bedrooms;

        public Property(String addr, double price, int beds) {
            this.address = addr;
            this.price = price;
            this.bedrooms = beds;
        }

        public String getAddress() { return address; }
        public double getPrice() { return price; }
        public int getBedrooms() { return bedrooms; }

        @Override
        public String toString() {
            return String.format("Property[address='%s', price=%.2f, bedrooms=%d]",
                                 address, price, bedrooms);
        }
    }

    public static void main(String[] args) {
        properties.add(new Property("123 Main St", 250_000, 3));
        properties.add(new Property("456 Oak Ave", 150_000, 2));
        properties.add(new Property("789 Pine Rd", 500_000, 4));
        properties.add(new Property("321 Cedar Ln", 200_000, 3));

        // 1. Filter properties under $300k
        filterAndAct(p -> p.getPrice() < 300_000,
                     p -> System.out.println("Affordable: " + p));

        System.out.println();

        // 2. Filter 3‑bedroom properties for showing
        filterAndAct(p -> p.getBedrooms() == 3,
                     p -> System.out.println("Schedule showing: " + p));
    }

    static void filterAndAct(Predicate<Property> tester, Consumer<Property> action) {
        for (Property p : properties) {
            if (tester.test(p)) {
                action.accept(p);
            }
        }
    }
}
