import java.util.Scanner;
public class atm
{
	public static void main (String args[])
	{
		int balance=10000000,withdraw,deposit;
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("ATM");
			System.out.println("Enter 1 for Withdraw");
			System.out.println("Enter 2 for Deposit");
			System.out.println("Enter 3 for Balance");
			System.out.println("Enter 4 for Exit");
			int choice=sc.nextInt();
			switch(choice)
			{
				case 1:     System.out.println("Enter money to Withdraw:");
					withdraw=sc.nextInt();
					if(balance >= withdraw)
					{
						balance=balance-withdraw;
						System.out.println("Collect Cash");
					}
					else
					{
						System.out.println("Insufficient Balance");
					}
					System.out.println("Remaining Balance: "+balance);
					break;
				case 2:	System.out.println("Enter money to be Deposited:");
					deposit=sc.nextInt();
					balance=balance+deposit;
					System.out.println("Amount Deposited");
					System.out.println("Total Balance: \n"+balance);
					break;
				case 3:	System.out.println("Balance: "+balance);
					break;
				case 4:	System.exit(0);
				default:	System.out.println("Error Please check the number you entered");
					break;
			}
		}
	}
}
