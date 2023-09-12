package maveninheritence;

class Vehicle
{
	public void run()
	{
		System.out.println("running");
	}
}
class Jeep extends Vehicle
{
	public void speed()
	{
		System.out.println("Speed");
	}
}
public class SingleInherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jeep obj=new Jeep();
		obj.speed();
		obj.run();

	}

}
