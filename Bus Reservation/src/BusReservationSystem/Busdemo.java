package BusReservationSystem;

import java.util.*;
import java.util.ArrayList;
public class Busdemo {
 public static void main(String[] args) {

//ArrayList-collection
	
ArrayList<bus> buses=new ArrayList<bus>();// adding
buses.add(new bus(1, true, 2))	;	
buses.add(new bus(2, true, 3))	;
buses.add(new bus(3, true, 2))	;
buses.add(new bus(4, false, 2));
ArrayList<Booking>bookings=new ArrayList<Booking>();

int useroption=1;
		Scanner scanner=new Scanner(System.in);
		for(bus b:buses)
		{
			b.disbusinfo();
		}
		while(useroption==1)
		{
			System.out.println("Enter 1 to Book and 2 to exit");
		useroption=scanner.nextInt();
		if(useroption==1)
		{
		 Booking booking=new Booking();
		 if(booking.isAvailable(bookings,buses))
		 {
			 bookings.add(booking);
		System.out.println(" your booking is comform");	 
		}
		 else {
			System.out.println("sorry .Bus is full .try anotherbus or  ");
		}
		 }
		}
	}

}
