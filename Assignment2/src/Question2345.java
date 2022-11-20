import java.util.Scanner;

public class Question2345 {

	public static void main(String[] args) {
		int a,n;
		System.out.println("enter the Number of Elements In an array : ");
		Scanner scan= new Scanner(System.in);
		
		n=scan.nextInt();
		
		int [] arr=new int[n];
		
		System.out.println("Enter elements of Array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Array Elements are : ");
		for(int elem:arr)
		{
			System.out.print(elem+ " ");
		}
		System.out.println();
		
		System.out.println("Press 1 : Quick Sort");
		System.out.println("Press 2 : Bubble Sort");
		System.out.println("Press 3 : Merge Sort");
		System.out.println("Press 4 : Selection Sort");
		
		
		 a=scan.nextInt();
		 
		if(a==1)
		{
			quickSort(arr, 0, n - 1);
			for(int elem:arr)
			{
				System.out.print(elem + " ");
			}
		}
		
		else if(a==2)
		{
			for(int i=0;i<arr.length;i++)
			{
				for(int j=1;j<arr.length-i;j++)
				{
					if(arr[j]<arr[j-1])
						{
							int temp=arr[j];
							arr[j]=arr[j-1];
							arr[j-1]=temp;
						}
				}
			}
			for(int elem:arr)
			{
				System.out.print(elem + " ");
			}
		}
		
		else if(a==3)
		{
			divide(arr ,0,n-1);
			
			for(int elem:arr)
			{
				System.out.print(elem + " ");
			}
		}
		
		else if(a==4)
		{
			for(int i=0;i<arr.length-1;i++)
			{    int index=i;
				for(int j=i+1;j<arr.length;j++)
				{
					if(arr[i]>arr[j])
						{					
							index=j;							
						}
				}
				int temp=arr[i];
				arr[i]=arr[index];
				arr[index]=temp;	
				
			}
			for(int elem:arr)
			{
				System.out.print(elem + " ");
			}
		}
		else 
		{
			System.out.println("Invalid Input ");
		}
	}
	
	public static void divide(int arr[], int si, int ei) 
	    { 
			if(si >= ei)
				{
				    return;
				}
			
		int mid = si + (ei-si)/2;
		
		 divide(arr, si, mid); 
	   	divide(arr, mid+1, ei);
	   	conquer(arr,si, mid, ei);

	    }
	
	public static void conquer(int arr[], int si, int mid, int ei) 
	{ 
		int merged[] =new int[ei-si+1];
		
			int idx1= si;

			int idx2= mid+1;
			 
			int x = 0;
			
			while(idx1 <= mid && idx2 <= ei) 
			{
			 
			if(arr[idx1] <= arr[idx2]) 
			{
				merged[x++]= arr[idx1++];
			}
			
			else
			merged[x++] = arr[idx2++];

			}

			while(idx1 <= mid) 
			{ 
				merged[x++] = arr[idx1++];
			}

			while(idx2 <= ei)
			{ 
				merged[x++] = arr[idx2++];
			}
			
			for(int i=0, j=si; i<merged.length; i++, j++) 
			{
			arr[j] = merged[i];
			}
}
	
	 static void swap(int[] arr, int i, int j)
	    {
	        int temp = arr[i];
	        arr[i] = arr[j];
	        arr[j] = temp;
	    }
	 
	  static int partition(int[] arr, int low, int high)
	    {
	  
	         int pivot = arr[high];
	  
	         int i = (low - 1);
	  
	        for (int j = low; j <= high - 1; j++) 
	        {	  
	           if (arr[j] < pivot) 
	           {	               
	                i++;
	                swap(arr, i, j);
	            }
	        }
	        swap(arr, i + 1, high);
	        return (i + 1);
	    }
	  static void quickSort(int[] arr, int low, int high)
	    {
	        if (low < high) {	             
	            int pi = partition(arr, low, high);
	  	         quickSort(arr, low, pi - 1);
	            quickSort(arr, pi + 1, high);
	        }
	    }
			
}
