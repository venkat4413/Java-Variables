public class Pyramid {
    public static void main(String[] args) {
        int n = 5; // Number of rows in the pyramid
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = i ; j <= n; j++) {
                System.out.print(i);
            }
           // System.out.println();
        }
    }
}