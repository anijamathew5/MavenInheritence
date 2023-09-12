package maveninheritence;

class Vehicle1
{
	public void speed()
	{
		System.out.println("SPEED");
	}
}
class Car1 extends Vehicle1
{
	public void color()
	{
		System.out.println("COLOR");
	}
}
class Bike extends Vehicle1
{
	public void Weight()
	{
		System.out.println("WEIGHT");
	}
	
}

public class HierarchicalInherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike obj=new Bike();
		Car1 obj1=new Car1();
		obj.Weight();
		obj.speed();
		obj1.color();

	}

}
