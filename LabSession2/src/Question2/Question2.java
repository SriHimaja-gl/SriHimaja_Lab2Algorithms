package Question2;

import java.util.Scanner;

public class Question2 
{
	public static void main(String[] args)
	{
		System.out.println("Enter the size of currency denominations ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		System.out.println("Enter the currency denominations value ");
		int[] notes = new int[size];
		
		for (int i=0;i<size;i++)
		{
			notes[i] = sc.nextInt();
		}
		
		System.out.println("Enter the total amount to be payed");
		int totalPayment = sc.nextInt();
		MergeSort mergeSort = new MergeSort();
		mergeSort.sort(notes, 0, notes.length-1);
		
		int[] notesCount = new int[size];
		
		try
		{
			for (int i=0;i<size;i++)
			{
				if(totalPayment>=notes[i])
				{
					notesCount[i] = totalPayment/notes[i];
					totalPayment = totalPayment - notes[i]*notesCount[i];
				}
			}
			if(totalPayment > 0)
			{
				System.out.println("Amount cant be payed using the given notes denominations");
			}
			else 
			{
				System.out.println("Your payment approach in order to give min no of notes will be");
				for(int i=0;i< size; i++)
				{
					if(notesCount[i] !=0)
						System.out.println(notes[i] +":"+ notesCount[i]);
				}
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println(e +"0 denomination notes are invalid");
		}
		sc.close();
	}
}
