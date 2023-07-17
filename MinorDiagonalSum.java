package minorDiagonalSum;

import java.util.Scanner;

public class MinorDiagonalSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter row size: ");
        int row = scanner.nextInt();
        System.out.print("Enter column size: ");
        int column = scanner.nextInt();
        System.out.println("Enter 2D array Elements");
        int array[][] = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        scanner.close();

        System.out.print(sum(array, row));

    }

    public static int sum(int array[][], int row) {
        int sum = 0, i = 0, j = row - 1;
        while (i < row && j >= 0) {
            sum += array[i][j];
            i++;
            j--;
        }
        return sum;
    }

}
