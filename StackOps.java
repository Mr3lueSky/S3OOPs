import java.util.*;

public class StackOps{
	int top = -1,N=5;
	int[] stack = new int[5];

void push(){
	if(top == N-1){
		System.out.println("Overflow");
	}
	else{
		System.out.println("Enter the element: ");
		//System.out.println("top = " + top);
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		top++;
		stack[top] = num;
		//System.out.println("top = " + top);
	}
}

void pop(){
	if (top == -1){
		System.out.println("The stack is empty!");
	}
	else{
		System.out.println("Removed item: "+stack[top]);
		top--;
	}
}

void display(){
	System.out.println("The elements of the stack are: ");
	for(int i=0;i<=top;i++){
	System.out.println(stack[i]);
	}
}

void peek(){
	if (top == -1){
		System.out.println("The stack is empty!");
	}
	System.out.println("The top element is: "+stack[top]);
}

public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	int g = 1;
	StackOps st = new StackOps();
	System.out.println("Menu\n1.Push\n2.Pop\n3.Peek\n4.Show\n5.Exit");
	while(g==1){
		System.out.println("Enter your choice: ");
		int choice = s.nextInt();
		switch(choice){
		case 1: st.push();
		break;
		case 2: st.pop();
		break;
		case 4: st.display();
		break;
		case 3: st.peek();
		break;
		case 5: System.exit(0);
		}
	} 
}
}
