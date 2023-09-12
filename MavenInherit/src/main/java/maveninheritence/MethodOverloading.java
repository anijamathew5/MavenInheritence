package maveninheritence;

public class MethodOverloading 
{
	public void add(int a,int b)
	{
		int c=a+b;
		System.out.println("The Sum is:" +c);
	}
	public void add(int a,float b)
	{
		float c=a+b;
		System.out.println("The Sum is:" +c);
	}

public static void main(String[] args) 
	{
		MethodOverloading obj=new MethodOverloading();
		obj.add(10, 20);
		obj.add(20, 12.5f);
	}

}
