
public class Fibonaci {
public static void main(String[] args) 
{
	int n = 1000, n1 = 0, n2 = 1;
	while (n1<= n)
	{
		System.out.print(n1 + " , ");
		int sum = n1 + n2;
		n1 = n2;
		n2 = sum;
	}
}
}