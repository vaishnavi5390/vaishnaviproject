package second;
import java.util.Scanner;
public class Loop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int count3 = 0,count4 = 0,count5 =0;
		for (int i = a; i<=b; i++)
		{
			if (i%3==0)
			{
				count3++;
			}
		}
		for (int i = a; i<=b; i++)
		{
			if(i%4==0)
			{
				count4++;
			}
		
		}
		for (int i = a; i<=b; i++)
		{
			if(i%5==0)
			{
				count5++;
			}
		}
		System.out.println("Divisible by 3 is :" +count3);
		System.out.println("Divisible by 4 is :" +count4);
		System.out.println("Divisible by 5 is :" +count5);
	}
}
