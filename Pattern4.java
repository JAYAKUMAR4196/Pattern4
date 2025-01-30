public class Pattern4 {
    public static void main(String[] args) {
        // Number of rows and columns
        int rows = 4;
        int cols = 4;

        // Outer loop to iterate through each row
        for (int i = 0; i < rows; i++) {
            // Inner loop to print each column
            for (int j = 0; j < cols; j++) {
                if (i == 0) {
                    // Print *# pattern for row 0
                    if (j % 2 == 0) {
                        System.out.print("*");
                    } else {
                        System.out.print("#");
                    }
                } else if (i == 1) {
                    // Print #### pattern for row 1
                    System.out.print("#");
                } else if (i == 2) {
                    // Print *#*# pattern for row 2
                    if (j % 2 == 0) {
                        System.out.print("*");
                    } else {
                        System.out.print("#");
                    }
                } else if (i == 3) {
                    // Print #### pattern for row 3
                    System.out.print("#");
                }
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}
