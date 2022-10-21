import java.util.*;
import java.lang.Math;
public class armstrong{
public static void main(String args[]){
int i,count,n,temp,flag,m;
double sum=0;
count = 0;
System.out.println("Enter the number: ");
Scanner s = new Scanner(System.in);
n = s.nextInt();
temp = n;
while(n>0){
	n = n/10;
	count = count + 1;
}
n = temp;
for(i=0;i<=count;i++){
m = n%10;
sum = sum + Math.pow(m,count);
n = n/10;
}
n = temp;
if(sum == n){
System.out.println("The number is armstrong");
}
else{
System.out.println("The number is not armstrong");
}
}
}

