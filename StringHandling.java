import java.util.*;
import java.lang.String;
public class StringHandling{
public static void main(String[] args){
int ch,length;
System.out.println("Menu\n1.To find length of string.\n2.To convert string to uppercase.\n3. To convert string to lowercase.\n4. To find a character in the string.\nTo concatenate 2 strings.");
System.out.println("Enter your choice:");
Scanner s = new Scanner(System.in);
Scanner str = new Scanner(System.in);
ch = s.nextInt();

switch(1){
case 1: System.out.println("Enter the string: ");
String s1 = str.nextLine();
System.out.println("The string length: "+s1.length());
break;
case 2: System.out.println("Enter the string: ");
s1 = str.nextLine();
System.out.println("Converted string: "+s1.toUpperCase());
break;
case 3: System.out.println("Enter the string: ");
s1 = str.nextLine();
System.out.println("Converted string: "+s1.toLowerCase());
break;
case 4: System.out.println("Enter the string: ");
s1 = str.nextLine();
System.out.println("Enter the character to be searched: ");
String s2 = str.nextLine();
System.out.println("Position: " + s1.indexOf(s2));
break;
}
}
}
