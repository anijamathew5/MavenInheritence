package maveninheritence;

class Supermparent
{
	public void show()
	{
		System.out.println("Parent method");
	}
}
class Supermchild extends Supermparent
{
	public void show()
	{
		System.out.println("Child");
	}
	public void display()
	{
		super.show();
		show();
	}
	
}
public class SuperMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supermchild obj=new Supermchild();
		obj.display();

	}

}
