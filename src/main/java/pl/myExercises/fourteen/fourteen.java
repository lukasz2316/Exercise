package pl.myExercises.fourteen;

public class fourteen {
    public static void main(String[] args) {
       // printNumberInTriangles(9);
        //printNumberInTrianglesReversed(9);
        //printReversedTriangle(9);
        printNumberInTrianglesReversedDiff(9);
    }
    public static void printNumberInTrianglesReversedDiff(int number) {
        for (int i = 1; i <= number; i++) {
            for (int j = number - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k < i; k++) {
                System.out.print(k);
            }
            System.out.println();
        }
    }

    public static void printNumberInTrianglesDiff(int number) {
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.print("\n");
        }
    }

    public static void printNumberInTriangles(int number) {
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.print("\n");
        }
    }

    public static void printNumberInTrianglesReversed(int number) {
        for (int i = 1; i <= number; i++) {
            for (int j = number - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k < i; k++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void printReversedTriangle(int num) {
        for (int i = 0; i <= num; i++) {
            for (int j = num - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int z = 0; z < i; z++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

}
