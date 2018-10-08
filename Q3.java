import java.util.*;
class Q3
{
	private static <T> void show(T arr[])
	{
	System.out.print("Entered Array is ");	
	for(int i=0;i<arr.length;i++)
	System.out.print(arr[i]+" ");	
	}
	
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the size ");
	int n = sc.nextInt();

	System.out.println("1 For Integer Array ");
	System.out.println("2 For Double Array ");
	System.out.println("3 For String Array ");
	System.out.println("4 For Character Array ");
	
	System.out.println();
	System.out.println();
	
	System.out.print("Enter your choice ");
	int choice = sc.nextInt();
	
		switch(choice)
		{
			case 1:
			Integer arr1[] = new Integer[n];
			System.out.print("Enter the elements ");
			for(int i=0;i<n;i++)
			arr1[i] = sc.nextInt();
			show(arr1);
			break;
			
			case 2:
			Double arr2[] = new Double[n];
			System.out.print("Enter the elements ");
			for(int i=0;i<n;i++)
			arr2[i] = sc.nextDouble();
			show(arr2);
			break;
			
			case 3:
			String arr3[] = new String[n];
			System.out.print("Enter the elements ");
			for(int i=0;i<n;i++)
			arr3[i] = sc.next();
			show(arr3);
			break;
			
			case 4:
			Character arr4[] = new Character[n];
			System.out.print("Enter the elements ");
			for(int i=0;i<n;i++)
			arr4[i] = sc.next().charAt(0);
			show(arr4);
			break;
			
			default:
			System.out.print("Invalid Choice ");
		}
	}
}
