import java.lang.*;
import java.util.*;

public class PrimeOrNot{

	public boolean checkPrime(int value){
		int count=0;
		for (int i=1; i <= (value/2); i++){
		
		if(value%i == 0){
		count++;
		}
		}
	if (count > 1){
	return false;
	
	}
	count = 0;
	return true;
	}
	
	public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			PrimeOrNot p = new PrimeOrNot();
			int input = sc.nextInt();
			boolean out;
			out = p.checkPrime(input);
			if(out){
			System.out.println("Prime");
			}
			else{
			System.out.println("Not Prime");
			}
	
	}

}