package Exercitii.Proiect1;

import java.util.Scanner;

public class Main {
    public static void printMatrix(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void lowerTriangularMatrix(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;

        if (m != n) {
            System.out.println("Matrix entered should be a Square Matrix");
            System.out.println("Try again...");
        } else {
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (i < j) {
                        arr[i][j] = 0;
                    }
                }
            }
            System.out.println("Lower Triangular Matrix is: ");
            printMatrix(arr);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int m, n;
        System.out.println("Enter the number of rows: ");
        m = sc.nextInt();

        System.out.println("Enter the number of columns: ");
        n = sc.nextInt();

        System.out.println("Enter the Matrix Elements: ");
        int arr[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Original Matrix is : ");
        printMatrix(arr);

        lowerTriangularMatrix(arr);
    }
}
