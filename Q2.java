import java.util.*;
class demo<T extends Comparable>
{
	public T arr[];
	
	void set(T arr[])
	{
	this.arr = arr;	
	}
	
	void sort()
	{
		for(int i=1;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-i;j++)
			{
				if(arr[j].compareTo(arr[j+1]) > 0)
				{
				T temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
				}
			}
		}
	}
	
	void show()
	{
	System.out.print("After sorting ");	
	for(int i=0;i<arr.length;i++)
	System.out.print(arr[i]+" ");	
	}
	
}

class Q2
{
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the size ");
	int n = sc.nextInt();
	demo obj = new demo();

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
			obj.set(arr1);
			break;
			
			case 2:
			Double arr2[] = new Double[n];
			System.out.print("Enter the elements ");
			for(int i=0;i<n;i++)
			arr2[i] = sc.nextDouble();
			obj.set(arr2);
			break;
			
			case 3:
			String arr3[] = new String[n];
			System.out.print("Enter the elements ");
			for(int i=0;i<n;i++)
			arr3[i] = sc.next();
			obj.set(arr3);
			break;
			
			case 4:
			Character arr4[] = new Character[n];
			System.out.print("Enter the elements ");
			for(int i=0;i<n;i++)
			arr4[i] = sc.next().charAt(0);
			obj.set(arr4);
			break;
			
			default:
			System.out.print("Invalid Choice ");
		}
	obj.sort();
	obj.show();
	}
}
