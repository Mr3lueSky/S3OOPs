import java.util.*;
public class SLSarray{
public static void main(String[] args){
int b,m,sum=0,largest=0,smallest=10000;
int[] arr = new int[30]; 
System.out.println("Enter the limit: ");
Scanner s = new Scanner(System.in);
m = s.nextInt();
System.out.println("Enter the elements:");
for(int i=0;i<m;i++){
b = s.nextInt();
sum = sum + b;
if(b > largest)
largest = b;
if(b < smallest)
smallest = b;
arr[i] = b;
}
System.out.println("The elements of the array are:\n");
for(int i = 0; i<m; i++){
System.out.println(arr[i] + " ");
}
System.out.println("The sum of elements: "+sum);
System.out.println("The largest element: "+largest);
System.out.println("The smallest element: "+smallest);
}
}
