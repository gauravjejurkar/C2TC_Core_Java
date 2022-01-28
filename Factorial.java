import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		int fact=1;
		
		System.out.println("Enter no to find Factorial");
		Scanner obj= new Scanner(System.in);
		
		int x=obj.nextInt();
		
		for (int i=1; i<=x; i++)
		{
			fact=fact*i;
		}
		
		System.out.println(fact);

	}

}
