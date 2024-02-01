package array;
interface Writer{
	public void wr();
}
class pen implements Writer
{
	public void wr() {
	System.out.println("try");
	}
}
class pencil implements Writer
{
	public void wr() {
	System.out.println("try ur");
	}
}

public class Interface {

	public static void main(String[] args) {
		
		Writer p=new pen();
		p.wr();
	}

}
