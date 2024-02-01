package Hello;
class ret{
    int num1=2,num2=4,result;

    public int add()
    {
    	result=num1+num2;
    	return result;
    }
}


public class returnmethod{
    public static void main(String []args){
       ret ob=new ret();
        ob.add();
    }
}
