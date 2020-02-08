import java.util.Scanner;


class Number{
	int val1;
	int val2;
	Scanner key = new Scanner(System.in);
	public int getVal1()
	{
		System.out.println("Enter the first value");
		val1 = Integer.parseInt(key.nextLine());
		return val1;
	}
	public int getVal2()
	{
		//Scanner key = new Scanner(System.in);
		System.out.println("Enter the Second value");
		val2 = Integer.parseInt(key.nextLine());
		return val2;
	}
}

interface interface1{
	public void add();
	
}


class decimal extends Number implements interface1{

	public void add() {
		// TODO Auto-generated method stub
		Number n1 = new Number();
		int v1=n1.getVal1();
		int v2=n1.getVal2();
		int v3=v1+v2;
		System.out.println("Result after decimal addition is :" + v3);
	}
	
}

class binary extends Number implements interface1{
		int[] sum1 = new int[20];
		int i=0;
		int carry=0;
		String s1;

	public void add() {
		// TODO Auto-generated method stub
		Number n1 = new Number();
		int val1=n1.getVal1();
		int val2=n1.getVal2();

		while (val1 != 0 || val2 != 0) 
		{
			sum1[i++] = (int)((val1 % 10 + val2 % 10 + carry) % 2);
			carry = (int)((val1 % 10 + val2 % 10 + carry) / 2);
			val1 = val1 / 10;
			val2 = val2 / 10;
		}
		if (carry != 0) {
			sum1[i++] = carry;
		}
		--i;
		System.out.println("Result after binary addition is :");
		while (i >= 0) {
			 System.out.print(sum1[i--]);
		}

		
	}
	
}




public class customer {
	
	public static void main(String args[])
	{
	
		System.out.println("1)Decimal 2)Binary");
		Scanner key = new Scanner(System.in);
		int ch = Integer.parseInt(key.nextLine());
		if(ch==1)
		{
			decimal obj1 = new decimal();
			obj1.add();
		}
		if(ch==2)
		{
			binary obj2 = new binary();
			obj2.add();
		}
	}
	

}
