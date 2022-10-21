import java.util.*;
public class ArrayAddition{
public static void main(String args[]){
int b,m1,n1,m2,n2;
int[][] arrA = new int[10][10];
int[][] arrB = new int[10][10];
int[][] arrC = new int[10][10];
int[][] arrD = new int[10][10];
Scanner s = new Scanner(System.in);
//Code to take in no of row and column of array1.
System.out.println("Enter the number of rows and columns: ");
m1 = s.nextInt();
n1 = s.nextInt();
System.out.println("Enter the elements: ");
//Code to take in elements of 1st array.
for(int i=0;i<m1;i++){
for(int j=0;j<n1;j++){
b = s.nextInt();
arrA[i][j] = b;
}
}
//Code to take in no of row and column of array1.
System.out.println("Enter the number of rows and columns: ");
m2 = s.nextInt();
n2 = s.nextInt();
//Code to take in elements of 2nd array.
for(int i=0;i<m2;i++){
for(int j=0;j<n2;j++){
b = s.nextInt();
arrB[i][j] = b;
}
}
if(m1 == m2 && n1 == n2){
//Code for matrix addition and display of sum matrix.
System.out.println("The required sum matrix is:");
for(int i=0;i<m1;i++){
for(int j=0;j<n1;j++){
arrC[i][j] = arrA[i][j] + arrB[i][j];
System.out.print(arrC[i][j] + " ");
}
System.out.print("\n");
}
}
//Code for matrix multiplication.
System.out.print("The required product matrix is:");
if(n1 == m2){
for(int i=0;i<m1;i++){
System.out.print("\n");
for(int j=0;j<n1;j++){
for(int k=0;k<n2;k++){
arrD[i][j] += arrA[i][k]*arrB[k][j];
}
System.out.print(arrD[i][j] + " ");
}
}
} 
}
}
