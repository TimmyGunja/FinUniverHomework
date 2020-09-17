package com.company;


public class Matrix_10_09_2020 {

    public static void main(String[] args) {
        int[][] matrix1 = { {1, 2, 3}, {4, 5, 6} };
        int[][] matrix2 = { {6, 5, 4}, {3, 2, 1}};


        int[][] mat1 = add(matrix1, matrix2); // Сумма матриц
        show(mat1);
        int[][] mat2 = subtract(matrix1, matrix2); // Разность матриц
        show(mat2);
        int[][] mat3 = multiplyBy(matrix1, 2); // Умножение матрицы на число
        show(mat3);
        int[][] mat4 = transp(matrix1); // Транспонирование матрицы
        show(mat4);

        int[][] matrix3 = { {2, 3}, {2, 1}, {1, 2}};
        int[][] mat5 = multiply(matrix1, matrix3); // Умножение матриц    1  2  3    2  3    [1*2+2*2+3*1  1*3+2*1+3*2]
        show(mat5);                                //                     4  5  6    2  1    [4*2+5*2+6*1  4*3+5*1+6*2]
                                                   //                                1  2
    }

    public static int[][] add(int[][] matrix1, int[][] matrix2) {
        int[][] newMatrix = new int[2][3];
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 3; j++) {
                newMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return newMatrix;
    }

    public static int[][] subtract(int[][] matrix1, int[][] matrix2) {
        int[][] newMatrix = new int[2][3];
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 3; j++) {
                newMatrix[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return newMatrix;
    }

    public static int[][] multiplyBy(int[][] matrix1, int x) {
        int[][] newMatrix = new int[2][3];
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 3; j++) {
                newMatrix[i][j] = matrix1[i][j] * x;
            }
        }
        return newMatrix;
    }

    public static int[][] transp(int[][] matrix) {
        int[][] newMatrix = new int[3][2];
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 3; j++) {
                newMatrix[j][i] = matrix[i][j];
            }
        }
        return newMatrix;
    }

    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
        int[][] newMatrix = new int[2][2];
        newMatrix[0][0] = matrix1[0][0]*matrix2[0][0] + matrix1[0][1]*matrix2[1][0] + matrix1[0][2]*matrix2[2][0];
        newMatrix[0][1] = matrix1[0][0]*matrix2[0][1] + matrix1[0][1]*matrix2[1][1] + matrix1[0][2]*matrix2[2][1];
        newMatrix[1][0] = matrix1[1][0]*matrix2[0][0] + matrix1[1][1]*matrix2[1][0] + matrix1[1][2]*matrix2[2][0];
        newMatrix[1][1] = matrix1[1][0]*matrix2[0][1] + matrix1[1][1]*matrix2[1][1] + matrix1[1][2]*matrix2[2][1];
        return newMatrix;
    }

    static void show(int[][] matrix){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                try {
                    System.out.print(matrix[i][j] + "\t");
                }
                catch (Exception IndexOutOfBoundsException){}
            }
            System.out.println();
        }
        System.out.println();
    }

}
