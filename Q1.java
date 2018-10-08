import java.util.*;
class Q1
{
	private static void check(String str,int len)
	{
		int i,j,pos = 0;
		String str1 = "";
		String str2 = "";
		String str3 = "";

		if(len == 0 || len > 10)
		System.out.print("Invalid Date ");

		else
		{
			for(i=0;i<len;i++)
			{
				if(str.charAt(i) == '/')
				{
				pos = i;	
				break;
				}
			}
			
			for(i=0;i<pos;i++)
			str1 += str.charAt(i);
				
			int dd = Integer.parseInt(str1);
			
			if(dd >= 32)
			System.out.print("Invalid Date ");
			
			else
			{
				for(i=pos+1;i<pos+3;i++)
				{
				str2 += str.charAt(i);	
				}
				int mm = Integer.parseInt(str2);
				
				if(mm >= 13)
				System.out.print("Invaid Date ");
			
				else
				{
					for(i=0;i<len;i++)
					{
						if(str.charAt(i) == '/')
						{
						pos = i;	
						}
					}
					
					for(i=pos+1;i<len;i++)
					{
						str3 += str.charAt(i);
					}
					int yy = Integer.parseInt(str3);
					
					String num[] = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen","Twenty","Twenty One","Twenty Two","Twenty Three","Twenty Four","Twenty Five","Twenty Six","Twenty Seven","Twenty Eight","Twenty Nine","Thirty","Thirty One"};
					String num1[] = {"Null","January","February","March","April","May","June","July","August","September","October","November","December"};
					int num2[] = new int[4];
					
					System.out.print(num[dd]+" ");
					System.out.print(num1[mm]+" ");
					
					int temp = yy;
					i = 0;
					while(yy > 0)
					{
					num2[i] = yy%10;
					yy = yy/10;
					i++;
					}
					
					for(i=3;i>=0;i--)
					System.out.print(num[num2[i]]+" ");
				}
			}			
		}
	}
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Date in dd/mm/yyyy format : ");
		String str = sc.nextLine();
		
		int len = str.length();
		
		check(str,len);
	}
}
