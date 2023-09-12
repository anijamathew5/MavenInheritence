package maveninheritence;

class Superiparent
{
	int a=10;
}
class Superichild extends Superiparent
{
	int a=20;
	public void show()
	{
		System.out.println(super.a);
		System.out.println(a);
	}
}
public class SuperInstance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Superichild obj=new Superichild();
		obj.show();

	}

}
