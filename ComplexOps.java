class Complex{
int real1,real2,img1,img2;

void sum(){
	int realsum = real1+real2;
	int imgsum = img1+img2;
	System.out.println("Sum = "+realsum+"+i"+imgsum);
	}
	
void difference(){
	int realdiff = real1-real2;
	int imgdiff = img1-img2;
	System.out.println("Difference ="+realdiff+"+i"+imgdiff);
	}

void product(){
	int realprod = real1*real2;
	int imgprod = img1*img2;
	System.out.println("Product = "+realprod+"+i"+imgprod);
	}
}


public class ComplexOps{
public static void main(String[] args){
Scanner s = new Scanner(System.in);
Complex num1 = new Complex();
System.out.println("Enter real1: ");
num1.real1=s.nextInt();
System.out.println("Enter real2: ");
num1.real2=s.nextInt();
System.out.println("Enter img1: ");
num1.img1=s.nextInt();
System.out.println("Enter img2: ");
num1.img2=s.nextInt();
num1.sum();
num1.difference();
num1.product();
}
}
