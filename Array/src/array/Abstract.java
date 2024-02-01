package array;
abstract class  call{
	public abstract void eat();
	public void milk()
	{
		System.out.println("try u");
	}
}
class recall extends call
{
	public void eat()
	{
		System.out.println("try");
	}
}

public class Abstract {

	public static void main(String[] args) {
	 // TODO Auto-generated method stub
		call c=new recall();
		c.eat();
		c.milk();
	}

}
