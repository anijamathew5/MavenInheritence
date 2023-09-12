package maveninheritence;
class OverrideParent
{
	public void show(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
}
class OverrideChild extends OverrideParent
{
	public void show(int a,int b)
	{
		int c=a-b;
		System.out.println(c);
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverrideChild obj=new OverrideChild();
		obj.show(20,10);
		obj.show(30,20);
}

}
