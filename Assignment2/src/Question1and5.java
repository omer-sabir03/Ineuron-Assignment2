	import java.util.Scanner;

	public class Question1and5 {

		public static void main(String[] args) {
			{
				int n,m,a,b;
				
				Scanner scan=new Scanner(System.in);
				
				System.out.println("Enter main Array Elements : ");
				
				m=scan.nextInt();
				
				System.out.println("Enter 2nd Array Elements : ");
				
				n=scan.nextInt();
				
				int[] mainArray=new int[m];
				int[] arrayCheck=new int[n];
				
				
				System.out.println("Enter Main Array Elements : ");
				for(int i=0; i<mainArray.length ;i++)
				{
					mainArray[i]=scan.nextInt();
					
				}
				
				System.out.println("Enter check Array Elements:  ");
				for(int i=0;i<arrayCheck.length;i++)
				{
					arrayCheck[i]=scan.nextInt();
				}
					
				System.out.print(" Main Array Elements Are : ");
				for(int elem:mainArray)
					System.out.print(elem+ " ");
				
				System.out.println();
				System.out.print("Check Array Elements Are: ");
			
				for(int elem:arrayCheck)
					System.out.print(elem+ " ");
				
				System.out.println();
				
				
				System.out.println("Enter 1 to find the duplicates present in an array.");
				System.out.println("Enter 2 to check whether an array is a subset of another array. :: ");
				
				a=scan.nextInt();
				
				if(a==1)
				{
					System.out.println("Enter 1 to find the duplicates present in Main array.");
					System.out.println("Enter  to find the duplicates present in 2nd array. :: ");
					b=scan.nextInt();
					
					if(b==1)
					{
				{   int c=0;
				System.out.print("Duplicates elements in mainArray : ");
					for (int i=0;i<mainArray.length-1;i++)
					{
						for(int j=i+1;j<mainArray.length;j++)
						{
							if(mainArray[i]==mainArray[j])
							{
								b++;
								System.out.print(mainArray[i]+" ");
							    break;
							    
							    
							}
						}
					}
					System.out.println();
					if(c==0)
					{
						System.out.println("No Duplicate Found: ");
					}
					else
						System.out.println("Number of duplicates found : "+b);
				}
					}
					
					if(b==2)
					{
				{   int c=0;
				System.out.print("Duplicates elements in 2nd Array : ");
					for (int i=0;i<arrayCheck.length-1;i++)
					{
						for(int j=i+1;j<arrayCheck.length;j++)
						{
							if(arrayCheck[i]==arrayCheck[j])
							{
								c++;
								System.out.print(arrayCheck[i]+" ");
							    break;
							    
							    
							}
						}
					}
					System.out.println();
					if(c==0)
					{
						System.out.println("No Duplicate Found: ");
					}
					else
						System.out.println("Number of duplicates found : "+b);
				}
					}
				}
				else if(a==2)
				{    System.out.println("Since Sets have distinct Elements so please make sure elements entered in both the arrays are distinct otherwise the result won't be accurate ");
					
				System.out.println();
				System.out.println();
				int z=0;
					for (int i=0;i<arrayCheck.length;i++)
					{
						for(int j=0;j<arrayCheck.length;j++)
						{
							if(arrayCheck[i]==mainArray[j])
							{   z++;
								break;
							}
							}
						}
					if(z==arrayCheck.length)
					{
						System.out.println("arrayCheck Is Subset of Main Array : ");
					}
					else
					{
						System.out.println("arrayCheck Is Not Subset of Main Array");
					}
					}
				else
				{
					System.out.println("Entered Wrong Value : " + a);
				}
		
			}	
		}
	}


