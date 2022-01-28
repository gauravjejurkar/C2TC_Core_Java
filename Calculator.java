		import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
			Scanner ss = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		
		double first = ss.nextDouble();
		double second = ss.nextDouble();
		System.out.println("Enter an Operator  (1]ADD, 2]SUB, 3]MUL, 4]DIV, 5]REMINDER): ");
		char operator = ss.next().charAt(0);
		
		double result;
		switch(operator)
		{
		case '+':
		result = first + second;
		break;
		case '-':
		result = first - second;
		break;
		case '*':
		result = first * second;
		break;
		case '/':
		result = first / second;
		break;
		case '%':
			result = first % second;
			break;
		 
		 
		default:
		System.out.printf("Error! operator is not correct");
		return;
		}
		System.out.printf("%.1f %c %.1f = %.1f", first, operator, second, result);
		}
		
	}


