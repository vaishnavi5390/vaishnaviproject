package second;
import java.util.Scanner;
public class Test {

	public int add() {
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values : ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = a+b;
		return (int) c;
	}
	public static void main(String[] args) {
		Test t1 = new Test();
		System.out.println(t1.add());
	}

}
