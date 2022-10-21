import java.util.*;
public class Grade{
public static void main(String[] args){
int m1,m2,m3,m4,m5,m6,i,avg,ch;
System.out.print("Score = 90 -100, Grade = A\nScore = 80-90, Grade = B\nScore = 70-80, Grade = C\nScore = 60-70, Grade = D\nScore = 50-60, Grade = P\nScore < 50, Grade = F\n\n");
System.out.println("Enter your marks: ");
Scanner s = new Scanner(System.in);
m1 = s.nextInt();
m2 = s.nextInt();
m3 = s.nextInt();
m4 = s.nextInt();
m5 = s.nextInt();
System.out.print("Physics: " + m1 + "\nChemistry: "+m2+"\nMaths: "+m3+"\nComputer Science:"+m4+"\nEnglish: "+m5+"\n");
avg = (m1+m2+m3+m4+m5)/5;
ch = avg/10;
System.out.println("Total = " + avg);
switch(ch){
case 10: System.out.print("Grade: A");
break;
case 9: System.out.print("Grade: B");
break;
case 8: System.out.print("Grade: C");
break;
case 7: System.out.print("Grade: D");
break;
case 6: System.out.print("Grade: E");
break;
case 5: System.out.print("Grade: P");
break;
default: System.out.print("Grade: F");
break;
}
}
}
