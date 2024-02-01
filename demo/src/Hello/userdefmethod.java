package Hello; 
class vicky{
    int num1=2,num2=4,num3=1,result;

    public void add(int num1,int num2)
    {
    	this.num1=num1;
    	this.num2=num2;
    	result=this.num1+this.num2;
    	System.out.println(result);
    }
    


public class userdefmethod{
    public static void main(String []args){
        vicky ob=new vicky();

        ob.add(2,3);
    }
}