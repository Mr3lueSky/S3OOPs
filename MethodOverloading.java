class Methover{
int sum(int a, int b, int c){
	return (a+b+c);
	}
double sum(int a,double b,int c){
	return(a+b+c);
	}
double sum(double a, double b){
	return (a+b);
	}	
}

public class MethodOverloading{
	public static void main(String[] args){
		Methover t = new Methover();
		System.out.println(t.sum(10,20));
		System.out.println(t.sum(1,2,3));
		System.out.println(t.sum(1.1,2.2));
		System.out.println(t.sum(5,3.3,8));
		
	}
}
