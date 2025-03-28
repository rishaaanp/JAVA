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
public static void main(String[] args) {
Scanner obj = new Scanner(System.in);
System.out.println("THE DIFFERENT OPERATIONS ON MATRIX ARE: ");
System.out.println("\n 1.Creating Matrix \n 2.Displaying Matrix");
System.out.println("\n 3.Calculate Column Sum \n 4.Calculate Row sum");
System.out.println("\n 5.Printing Average of All Elements in Matrix ");
System.out.println("\n 6.Checking Diagonal or not \n 7.Exit the program ");
int choice;
int r=0,c=0;
Matrix matx=null;
String ch;
System.out.print("Enter yes/no to perform operations on Matrix:");
ch = obj.next();
while (ch.equals("yes")) {
System.out.print("Enter the choice:");
choice = obj.nextInt();
if(choice==1){
double v;
System.out.println("Enter number of rows:");
r = obj.nextInt();
System.out.println("Enter number of columns:");
c = obj.nextInt();
matx = new Matrix(r, c);
System.out.println("Enter the values:");
for (int i = 0; i < r; i++) {
for (int j = 0; j < c; j++) {
v = obj.nextDouble();
matx.setElement(i, j, v);
}
}
}
else if(choice==2){
System.out.println("Matrix values:");
for (int i = 0; i < r; i++) {
for (int j = 0; j < c; j++) {
System.out.print(matx.getElement(i, j) + " ");
}
System.out.println();
}
}
else if(choice==3){
int col;
System.out.print("Enter the column to be added:");
col = obj.nextInt();
int col1=col-1;
double colSum=0;
for(int i=0;i<r;i++){
colSum+=matx.getElement(i,col1);
}
System.out.println("Column sum of column "+col+"is:"+colSum);
}
else if(choice==4){
int row;
System.out.print("Enter the row to be added:");
row=obj.nextInt();
int row1=row-1;
double rowSum=0;
for(int i=0;i<c;i++){
rowSum+=matx.getElement(row1,i);
}
System.out.println("Row Sum of the row "+row+"is:"+rowSum);
}
else if(choice==5){
int totelmts=r*c;
double avg=0;
for(int i=0;i<r;i++){
for(int j=0;j<c;j++){
avg+=matx.getElement(i,j);
}
}
avg/=totelmts;
System.out.println("Average of the matrix elements is:"+avg);
}
else if(choice==6){
boolean diagonal=false;
for(int i=0;i<r;i++){
for(int j=0;j<c;j++){
if(i!=j && matx.getElement(i,j)==0){
diagonal=true;
}
}
}
if(diagonal==true){
System.out.println("It is a diagonal matrix");
}
else{
    System.out.println("It is not a diagonal matrix");
    }
    }
    else if(choice==7){
    System.out.println("THANK YOU");
    }
    else{
    System.out.println("Invalid choice ,kindly enter valid choice");
    }
    System.out.print("Enter yes/no to perform operations on Matrix:");
    ch = obj.next();
    }
    }
    }