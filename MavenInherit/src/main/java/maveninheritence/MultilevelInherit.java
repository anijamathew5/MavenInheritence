package maveninheritence;

class Birds
{
	public void sound() 
	{
		System.out.println("Sound");
	}
}
class Parrot extends Birds
{
	public void colour()
	{
		System.out.println("COLOUR");
	}
}
class Peacock extends Parrot
{
	public void weight()
	{
		System.out.println("WEIGHT");
	}
}
public class MultilevelInherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Peacock obj=new Peacock();
		obj.weight();
		obj.colour();
		obj.sound();
		
	}

}
