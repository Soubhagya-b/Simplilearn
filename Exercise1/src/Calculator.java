import java.util.Scanner;
public class Calculator
{
	public static void main(String[] args)
	{
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Enter two numbers : ");
			double first = s.nextDouble();
			double second = s.nextDouble();
			
			System.out.println("Enter sign [+ ,- ,*,/ , % ] : ");
			char sign = s.next().charAt(0);
			
			double result =0.0;
			if (sign== '+'){
				result = first + second;
				System.out.println("Result of addition : "+ result);
			}
			else if (sign== '-'){
				result = first - second;
				System.out.println("Result of substraction : "+ result);
			}
			else if (sign== '*'){
				result = first * second;
				System.out.println("Result of multiplication : "+ result);
			}
			else if (sign== '/'){
				result = first / second;
				System.out.println("Result of division : "+ result);
			}
			else if(sign== '%'){
				result = first % second;
				System.out.println("Result of module : "+ result);
			}
		}
	}
}