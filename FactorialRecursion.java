import java.util.Scanner;

public class Main {
    static int factorial(int n){
        if (n==0||n==1){
            return 1;
    }
    else{
        return n*factorial(n-1);
    }
        }
    public static void main(String[] args){
        int ans,n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        ans = factorial(n);
        System.out.println(ans);
        s.close();
    }
}
