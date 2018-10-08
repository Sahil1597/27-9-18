import java.util.*;
class Student implements Comparable
{
	private String name;
	private int age;
	
	void setAge(int age)
	{
	this.age = age;
	}
	
	void setName(String name)
	{
	this.name = name;	
	}
	
	int getAge()
	{
	return this.age;	
	}
	
	String getName()
	{
	return this.name;	
	}
	
	public int compareTo(Object o)
	{
		Student s = (Student)o;
		
		if(this.name.compareTo(s.getName()) == 0)
		{
			if(this.age > s.getAge())
			return 1;

			else if(this.age < s.getAge())
			return -1;

			else
			return 0;	
		}
		
		else if(this.name.compareTo(s.getName()) > 0)
			return 1;
		
		else
		return -1;	
	}
}

class demo
{
	static <T extends Comparable> void sort(T[] arr)
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
	
	static <T extends Student> void display(T[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i].getAge()+"    "+arr[i].getName());
		}
		System.out.println();
		System.out.println();
	}
	
}

class Q4
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size ");
		int n = sc.nextInt();
		Student arr[] = new Student[n];
		
		System.out.println("Enter the age followed by name ");
		for(int i=0;i<n;i++)
		{
		int age = sc.nextInt();
		String name = sc.next();
		
		arr[i] = new Student();
		arr[i].setAge(age);
		arr[i].setName(name);	
		}
		System.out.println();
		System.out.println("Enter data is ");
		demo.display(arr);
		demo.sort(arr);
		System.out.println("After sorting ");
		demo.display(arr);
	}
}