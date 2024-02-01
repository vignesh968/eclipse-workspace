package oops;

public class student {
private int rollno; 
public String name; //default access modifer
public student() {
	rollno=12;
	name="ragul";
}
public student(String name)
{
	this.name=name;
}
public student(int rollno,String name)
{
	this.rollno=rollno;
	this.name=name;
}
public  void print() // we can print for all object just use
//one print statement but you must call the method for each object
{
	System.out.println(name+" "+rollno);
}
public int getrollno() {
	return rollno;
}
public String getname()
{
	return name;
} 
public void setrollno(int num) 
{
	if (num<0) {
		System.out.println("sorry, rollno  is not accessable");
		return;
	}
	rollno=num;
}
}
