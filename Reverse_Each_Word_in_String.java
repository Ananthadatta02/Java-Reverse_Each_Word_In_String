package string_Reversal;

import java.util.*;

public class Reverse_Each_Word_in_String 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String");
		String st = s.nextLine();
		String arr[] = st.split(" ");
		System.out.println("Before Reversing "+ Arrays.toString(arr));
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i] = reverse(arr[i]);
		}
		System.out.println("After Reversing "+ Arrays.toString(arr));
		String result = "";
		for(int i=0;i<=arr.length-1;i++)
		{
			if(i==arr.length)
				result = result + arr[i];
			else
				result = result + arr[i] + " ";
		}
		System.out.println(result);
	}
	public static String reverse(String a)
	{
		String rev = "";
		for(int i=a.length()-1;i>=0;i--)
		{
			rev = rev + a.charAt(i);
		}
		return rev;
		
	}
}
