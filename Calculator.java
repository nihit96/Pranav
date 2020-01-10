import java.util.Scanner; 
public class Calculator{
 public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		int sum = a+b;
		System.Out.Println("Sum is :-" , sum);
	}
}