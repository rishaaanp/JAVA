import java.util.Scanner;
public class Matrix {
private int rows;
private int columns;
private double[][] data;
private String name;
public Matrix(int rows, int columns) {
this.rows = rows;
this.columns = columns;
this.data = new double[rows][columns];
}
public void setElement(int row, int col, double value) {
data[row][col] = value;
}
public double getElement(int row, int col) {
    return data[row][col];
    }
    public Matrix add(Matrix mat2) {
    int i, j;
    Matrix sum = new Matrix(rows, columns);
    for (i = 0; i < sum.rows; i++) {
    for (j = 0; j < sum.columns; j++) {
    sum.data[i][j] = this.data[i][j] + mat2.data[i][j];
    }
    }
    return sum;
    }
    public Matrix multiply(Matrix mat2) {
    int i, j;
    Matrix product = new Matrix(rows, columns);
    for (i = 0; i < this.rows; i++) {
    for (j = 0; j < mat2.columns; j++) {
    double pro = 0;
    int k;
    for (k = 0; k < this.columns; k++) {
    pro += this.data[i][k] * mat2.data[k][j];
    }
    product.setElement(i, j, pro);
    }
    }
    return product;
    }
    public Matrix subtract(Matrix mat2) {
    Matrix difference = new Matrix(rows, columns);
    for (int i = 0; i < difference.rows; i++) {
    for (int j = 0; j < difference.columns; j++) {
    difference.data[i][j] = this.data[i][j] - mat2.data[i][j];
    }
    }
    return difference;
    }
    public Matrix transpose() {
        Matrix transposed = new Matrix(this.columns, this.rows);
        for (int i = 0; i < transposed.rows; i++) {
        for (int j = 0; j < transposed.columns; j++) {
        transposed.setElement(i, j, this.data[j][i]);
        }
        }
        return transposed;
        }
        public String toString() {
        String toSt = "";
        for (int i = 0; i < this.rows; i++) {
        for (int j = 0; j < this.columns; j++) {
        toSt += this.data[i][j] + " ";
        }
        }
        return toSt;
        }
        public static void main(String[] args) {
        int r1, r2, c1, c2;
        double v1, v2;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        r1 = obj.nextInt();
        System.out.println("Enter number of columns:");
        c1 = obj.nextInt();
        Matrix mat = new Matrix(r1, c1);
        System.out.println("Enter the values:");
        for (int i = 0; i < r1; i++) {
        for (int j = 0; j < c1; j++) {
        v1 = obj.nextDouble();
        mat.setElement(i, j, v1);
        }
        }
        System.out.println("Matrix values:");
        for (int i = 0; i < r1; i++) {
        for (int j = 0; j < c1; j++) {
        System.out.print(mat.getElement(i, j) + " ");
    }
    System.out.println();
    }
    System.out.println("Enter number of rows:");
    r2 = obj.nextInt();
    System.out.println("Enter number of columns:");
    c2 = obj.nextInt();
    Matrix mat2 = new Matrix(r2, c2);
    System.out.println("Enter the values:");
    for (int i = 0; i < r2; i++) {
    for (int j = 0; j < c2; j++) {
    v2 = obj.nextDouble();
    mat2.setElement(i, j, v2);
    }
    }
    System.out.println("MATRIX ADDITION: \n");
    if (r1 == r2 && c1 == c2) {
    System.out.println("After matrix addition:");
    System.out.println();
    Matrix sum = mat.add(mat2);
    for (int i = 0; i < r1; i++) {
    for (int j = 0; j < c1; j++) {
    System.out.print(sum.getElement(i, j) + " ");
    }
    System.out.println();
    }
    } else {
    System.out.println("UNEQUAL ORDER \n");
    }
    System.out.println("MATRIX MULTIPLICATION \n");
    if (c1 == r2) {
    System.out.println("After matrix multiplication:");
    System.out.println();
    Matrix product = mat.multiply(mat2);
    for (int i = 0; i < r1; i++) {
    for (int j = 0; j < c2; j++) {
    System.out.print(product.getElement(i, j) + " ");
}
System.out.println();
}
} else {
System.out.print("Unequal order \n");
}
System.out.println("MATRIX SUBSTRACTION:");
if (r1 == r2 && c1 == c2) {
System.out.println("After matrix subtraction:");
System.out.println();
Matrix difference = mat.subtract(mat2);
for (int i = 0; i < r1; i++) {
for (int j = 0; j < c1; j++) {
System.out.print(difference.getElement(i, j) + " ");
}
System.out.println();
}
} else {
System.out.print("Unequal Order \n ");
}
System.out.println("After matrix transpose:");
System.out.println();
Matrix transposing1 = mat.transpose();
for (int i = 0; i < c1; i++) {
for (int j = 0; j < r1; j++) {
System.out.print(transposing1.getElement(i, j) + " ");
}
System.out.println();
}
System.out.println("After matrix transpose:");
System.out.println();
Matrix transposing2 = mat2.transpose();
for (int i = 0; i < c2; i++) {
for (int j = 0; j < r2; j++) {
System.out.print(transposing2.getElement(i, j) + " ");
}
System.out.println();
}
System.out.println("After toString conversion of Matrix 1:");
String st1 = mat.toString();
System.out.print(st1);
System.out.println();
System.out.println("After toString conversion of Matrix 2:");
String st2 = mat2.toString();
System.out.print(st2);
System.out.println();
}
}