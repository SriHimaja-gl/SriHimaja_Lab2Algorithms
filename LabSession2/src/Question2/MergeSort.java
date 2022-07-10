package Question2;

public class MergeSort
{
	void merge(int array[], int left, int mid, int right) 
	{
		//finding the sizes of 2 sub arrays to be merged
		int n1 = mid-left+1;
		int n2 = right-mid;
		
		//create temp arrays
		int larray[] = new int[n1];
		int rarray[] = new int[n2];
		
		for(int i=0; i < n1; i++)
		{
			larray[i] = array[left+i];
		}
		for(int j=0; j < n2; j++)
		{
			rarray[j] = array[mid+1+j];
		}
		
		//merging the temp arrays
		
		int i = 0,j = 0;
		int k = left;
		
		while(i < n1 && j < n2)
		{
			if(larray[i] >= rarray[j])
			{
				array[k] = larray[i];
				i++;
			}
			else
			{
				array[k] = rarray[j];
				j++;
			}
			k++;				
		}
		//copying any remaining elements of left array
		while(i < n1)
		{
			array[k] = larray[i];
			i++;
			k++;
		}
		//copying any remaining elements of right array
		while(j < n2)
		{
			array[k] = rarray[j];
			j++;
			k++;
		}
		
	}
	public void sort(int array[], int left, int right)
	{
		if(left < right)
		{
			//find mid point
			int mid = (left+right)/2;
			
			//sorting the left and right parts of the arrays
			sort(array,left,mid);
			sort(array,mid+1,right);
			
			//merging the sorted halves
			merge(array,left,mid,right);
		}
	}

}
