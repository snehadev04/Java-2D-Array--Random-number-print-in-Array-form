// Class demonstrating the usage of 2D arrays in Java
public class array {
    public static void main(String[] args) {
        // Declare a 2D array of size 4x5
        int num[][] = new int[4][5];
         
        // Fill and print the array using nested for-loops
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                // Generate random integers between 0 and 9 and assign to array elements
                num[i][j] = (int) (Math.random() * 10);
                // Print each element of the array
                System.out.print(num[i][j] + " ");
            }
            // Move to the next line after printing each row
            System.out.println();
        }

        // Add a newline for better separation in the output
        System.out.println();

        // Alternative method: Fill and print the array using enhanced for-loops
        // Note: This method does not fill the array, it only prints random numbers
        for (int n[] : num) {
            for (int m : n) {
                // Generate random integers between 0 and 9 and print each element
                m = (int) (Math.random() * 10);
                System.out.print(m + " ");
            }
            // Move to the next line after printing each row
            System.out.println();
        }
    }
}
