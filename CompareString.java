package Day3Acc;
import java.util.Scanner;
public class CompareString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enterb the String");
		String str=sc.next();
		String equalscase=equalscase(str);
        System.out.println("The string is:"+equalscase);
        String equalswithignore=equaligonorecase(str);
        System.out.println("The string is:"+equalswithignore);
        

	}
	static String  equalscase(String str)
	{
		String a;
		if(str.equals("fujitsu"))
		
			a="Match";
		else
			a="Not Match";
		
		return a;
		
	}
	static String  equaligonorecase(String str)
	{
		String a;
		if(str.equalsIgnoreCase("fujitsu"))
		
			a="Match";
		else
			a="Not Match";
		
		return a;
		
	}

}
