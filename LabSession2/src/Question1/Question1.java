package Question1;

import java.util.Scanner;

public class Question1 
{
	public static void main(String[] args)
	{
		System.out.println("Enter the size of the transaction array: ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		System.out.println("Enter values of array: ");
		int[] array = new int[size];
		
		for (int i=0;i<size;i++)
		{
			array[i] = sc.nextInt();
		}
		System.out.println("Enter the total no of targets that needs to be achieved");
		int targetTotal = sc.nextInt();
		while (targetTotal-- !=0)
		{
			int flag=0;
			System.out.println("Enter the value of the target");
			int target = sc.nextInt();
			int sum = 0;
			for (int i=0; i< array.length; i++)
			{
					sum=sum+array[i];
					if(sum>= target)
					{
						System.out.println("Target achieved after "+(i+1)+" transactions");
						flag=1;
						break;
					}
			}
			if(flag==0)
			{
				System.out.println("Target is not achieved");
			}
			
		}
		sc.close();
	}
}
