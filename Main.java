//-------------start-------------

public class Main {

//-----------main code-----------
 
	public static void main(String[] args) 
	{
		int a;
		a=3456789;
		int year,days;
		int cn=60*24*365;
		year=a/cn;
		System.out.print(year+" years ");
		a=a-(year*cn);
		int cm=60*24;
		days=a/cm;
		System.out.print("and "+days+" days.");
	}
}

