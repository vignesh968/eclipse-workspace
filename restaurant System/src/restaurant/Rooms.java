package restaurant;
import java.util.*;
public class Rooms {
private int roomno;
private int members;
private String[]names;
private int amount=1;
private int perperson=1000;
Rooms()
{ 
	ArrayList<Rooms> rooms = new ArrayList<>();
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter a room No: ");
	roomno=scanner.nextInt();

	
	System.out.println("Enter a total member list: ");
	members=scanner.nextInt();
	String names[]=new String[members];
	

	System.out.println("Enter a Name of the members: ");
	int i=0;
	while(members!=i)
	{
	names[i]=scanner.next();
	
	i++;}
	System.out.println("amount of the room: ");
	this.amount=members*perperson;
	System.out.println(amount);
	
	for(Rooms b:rooms )
	{
	if(b.getroomno()==roomno)
	{
		System.out.println("already booked room");
		break;
	}
	}
}


public int getroomno()
{
	return roomno;
}
public int getmembers()
{
	return members;
}
public String[] getnames()
{
	
return names;
}
public int getamount()
{
	return amount;
}
@Override
public String toString() {
	
    return "Room No: " + roomno + ", Members: " + members+",namelist: "+Arrays.toString(names)+ ", Amount: " + amount;
}

}
