package BusReservationSystem;

import java.util.*;
import java.text.*;

public class Booking {
 String passengerName;
int busno;
Date date;
Booking()
{
	Scanner scanner=new Scanner(System.in);
System.out.println("Enter name of passenger: ");
passengerName=scanner.next();
System.out.println("Enter bus No: ");
busno=scanner.nextInt();
System.out.println("Enter date dd-mm-yyyy");
String dateinput=scanner.next();// date give as string so we use string
SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");//string to date obj

try {
	dateFormat.parse(dateinput);
} catch (ParseException e) {
	
	e.printStackTrace();
}
}
public boolean isAvailable(ArrayList<Booking>bookings,ArrayList<bus>buses)
{
	int ca = 0;
	for(bus bus:buses)
	{
		if(bus.getbusno()==busno)
		{
		ca=bus.getCapacity();
		}
	}
	int booked=0;
	for(Booking b:bookings)
	{
		if(b.busno==busno && b.date.equals(date))
		{
			booked++;
		}
	}
	return booked<ca? true:false;
}
}
