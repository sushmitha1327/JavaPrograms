package day5;

public class Property {
    int food;
    double rent;
    int expenses;
    double total;

    void home() {
        food = 10000;
        rent = 200000;
        expenses = 10000;
        total = food + rent + expenses;
        System.out.println("The total amount for home is Rs." + total);
    }

    void apartment() {
        food = 5000;
        rent = 80000;
        expenses = 3000;
        total = food + rent + expenses;
        System.out.println("The total amount for apartment is Rs." + total);
    }

    public static void main(String[] args) {
        Property p = new Property();
        p.home();
        p.apartment();
    }
}
