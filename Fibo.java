import java.lang.*;
import java.util.*;
public class Fibo{

public void generateFibonacci(int n){
	int a = 0;
	int b = 1;
	int temp = 0;
	//System.out.print(a+" "+b);
 	for(int i=0; i<=n; i++){
	if(i==0){
		System.out.print(" "+a);
		
	}
	if(i==1){
		System.out.print(" "+b);
	}
	temp=a;
	a=b;
	b=a+temp;
	System.out.print(" "+b);	
	}

	
}

	public static void main(String[] args){
		Fibo f = new Fibo();
		Scanner sc = new Scanner(System.in);
		int in = sc.nextInt();
		f.generateFibonacci(in);
		
		
	}

}