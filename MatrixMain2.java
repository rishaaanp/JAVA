import java.util.Scanner;
class Matrix {
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
public Matrix transpose() {
Matrix transposed = new Matrix(this.columns, this.rows);
for (int i = 0; i < transposed.rows; i++) {
for (int j = 0; j < transposed.columns; j++) {
transposed.setElement(i, j, this.data[j][i]);
}
}
return transposed;
}
}
class SquareMatrix extends Matrix {
private int order;
public SquareMatrix(int size) {
super(size, size);
order = size;
}
public boolean isSymmetric() {
Matrix transposing = this.transpose();
boolean sym = false;
for (int i = 0; i < order; i++) {
for (int j = 0; j < order; j++) {
if (this.getElement(i, j) != transposing.getElement(i, j)) {
return false;
}
}
}
return true;
}
public double determinant() {
double result = 0;
if(order==1){
return this.getElement(0,0);
}
if(order==2){
result=this.getElement(0,0)*
this.getElement(1,1)-this.getElement(0,1)*
this.getElement(1, 0);
return result;
}
if(order==3){
double row1=this.getElement(0,0)*(this.getElement(1,1)*
this.getElement(2,2)-this.getElement(1,2)*
this.getElement(2,1));
double row2=this.getElement(0,1)*(this.getElement(1,0)*
this.getElement(2,2)-
this.getElement(1,2)*this.getElement(2,0));
double row3=this.getElement(0,2)*(this.getElement(1,0)
*this.getElement(2,1)-this.getElement(1,1)*
this.getElement(2,0));
result=row1-row2+row3;
return result;
}
return result;
}
public boolean isSingular() {
double det=this.determinant();
boolean deter=false;
if(det==0){
deter=true;
}
else{
deter=false;
}
return deter;
}
public double trace(){
double result=0;
for(int i=0;i<this.order;i++){
for(int j=0;j<this.order;j++){
if(i==j){
result+=this.getElement(j,j);
}
}
}
return result;
}
}
class DiagonalMatrix extends SquareMatrix{
private double values[];
public DiagonalMatrix(int size,double value[]){
super(size);
this.values=value;
for(int i=0;i<size;i++){
setElement(i,i,values[i]);
}
}
}
public class MatrixMain2{
public static void main(String[] args) {
Scanner obj = new Scanner(System.in);
int size;
double val;
System.out.print("Enter the size:");
size = obj.nextInt();
SquareMatrix sqm = new SquareMatrix(size);
System.out.print("Enter the values:");
for (int i = 0; i < size; i++) {
for (int j = 0; j < size; j++) {
val = obj.nextDouble();
sqm.setElement(i, j, val);
}
}
boolean s = sqm.isSymmetric();
if (s == true) {
System.out.println("Symmetric");
}
else {
System.out.println("Non-symmetric");
}
double det=sqm.determinant();
System.out.println("Determinant:"+det);
boolean deter=sqm.isSingular();
if(deter==true){
System.out.println("Singular Matrix");
}
else{
System.out.println("Non-Singular Matrix");
}
double traces=sqm.trace();
System.out.println("Trace:"+traces);
double value1[];
System.out.print("Enter the size:");
size=obj.nextInt();
System.out.println("Enter the values for the diagonal Matrix");
value1=new double[size];
for(int i=0;i<size;i++){
value1[i]=obj.nextDouble();
}
DiagonalMatrix dim=new DiagonalMatrix(size,value1);
System.out.println("Diagonal Matrix :");
for(int i=0;i<size;i++){
for(int j=0;j<size;j++){
if(i==j){
System.out.print(dim.getElement(i,j)+" ");
}
else{
System.out.print("0.0 ");
}
}
System.out.println();
}
}
}