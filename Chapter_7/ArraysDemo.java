public class ArraysDemo {

    public static void main(String[] args) {

        int[] originalArray = new int[5]; 
        display("Original array:", originalArray);

        for (int i = 0; i < originalArray.length; i++) {
            originalArray[i] = 8;
        }
        display("After filling with 8s:", originalArray);

        originalArray[2] = 6;
        originalArray[4] = 3; 
        display("After changing two values:", originalArray);

        java.util.Arrays.sort(originalArray); 
        display("After sorting:", originalArray);
    }

    public static void display(String message, int[] array) {
        System.out.print(message + " ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}