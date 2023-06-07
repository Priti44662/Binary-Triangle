public class BinaryTriangle {
    public static void main(String[] args) {
        int n = 5; // Number of rows in the triangle
        for (int i = 1; i <= n; i++) {
            // Print spaces before each row
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            // Print binary digits for each row
            for (int j = 1; j <= i; j++) {
                if (j % 2 == 0) {
                    System.out.print("0 ");
                } else {
                    System.out.print("1 ");
                }
            }
            System.out.println(); // Move to next line
        }
    }
}

