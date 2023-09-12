package maveninheritence;

class Supercparent
{
	Supercparent()
	{
	System.out.println("Constructor Parent");
	}
	
}
class Supercchild extends Supercparent
{
	Supercchild()
	{
		super();
		System.out.println("Constructor Child");
	}
}

public class SuperConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supercchild obj=new Supercchild();

	}

}
