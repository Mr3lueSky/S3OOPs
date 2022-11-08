interface Test{
	void Square();
}

class Arithmetic implements Test{
	public void Square(){
		int a = 10;
		int sqr = 10*10;
		System.out.println("The number =" + a);
		System.out.println("Square of the number = " + sqr);
	}
}
public class Square{
	public static void main(String[] args){
		Arithmetic obj = new Arithmetic();
		obj.Square();
	}
}
