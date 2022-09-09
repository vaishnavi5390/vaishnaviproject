package second;
import java.util.Scanner;
public class Hotel {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of members in the family : ");
		int num = sc.nextInt();
		if (num<=4)
		{
			System.out.println("Enter the no of adults : ");
			int a = sc.nextInt();
			System.out.println("Enter the no of childerns : ");
			int b = sc.nextInt();
			if (a==1 &&b==2 || a==2 && b==1 || a==2 && b==2||a==1 && b==3)
			{
				System.out.println("Enter 1 for Hotel 1");
				System.out.println("Enter 2 for Hotel 2");
				int choice = sc.nextInt();
				if (choice ==1)
				{
					System.out.println("Enter 1 for AC romm : 3000");
					System.out.println("Enter 2 for Non AC romm : 2500");
				}
				else
				{
					System.out.println("Enter 1 for AC romm : 2000");
					System.out.println("Enter 2 for Non AC romm : 1800");
				}
				int roomType = sc.nextInt();
				if (choice == 1 && roomType == 1)
				{
					System.out.println("price : 3000");
				}
				else if (choice == 1 && roomType == 2)
				{
					System.out.println("price : 2500");
				}
				else if (choice == 2 && roomType == 1)
				{
					System.out.println("price : 2000");
				}
				else if (choice == 2 && roomType == 2)
				{
					System.out.println("price : 1800");
				}
				else
					System.out.println("Enter the valid number");
			}
			else
				System.out.println("You need to take another room");
		}
		else
			System.out.println("only 4 members are allowed in a room");
		
		
	}
}