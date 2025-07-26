package program;

public class ArrayFetchDemo {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50}; 
        try {
            System.out.println("6th element: " + arr[5]); 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("Attempted to fetch 6th element.");
        }
    }
}
