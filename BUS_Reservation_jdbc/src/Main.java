import java.sql.SQLException;
import java.util.*;

import com.sun.tools.javac.comp.Check;


public class Main {

	public static void main(String[] args)throws Throwable  {
		Busdao busdao=new Busdao();
//try {
		busdao.displaybusInfo(); 
		Bus bus=new Bus();
	boolean useropt=true; 
	Scanner scanner=new Scanner(System.in);
	while (useropt) 
	{
		System.out.println("Enter 1 to BOOK and 2 to check and 3 to Exist");
		int s=scanner.nextInt();
//		
		switch (s) {
		case 1:
			System.out.println("book your ticket");
			Booking booking=new Booking();
			//int find=bus.getCapacity() -booking.findcapacity(booking.busno);
//		System.out.println("there are balance capacity to book bus "+bus.getCapacity()+"from :"+find);
			if(booking.isAvailable())
			{
				Bookingdao bookingdao=new Bookingdao();
				bookingdao.addbooking(booking);
				
				System.out.println("Your booking is comfirmed  ");
			}
			else 
			{
				System.out.println("Sorry , bus is full ,try another bus or date ");
			
			}
			break;
		case 2:
			System.out.println("check your capacity today \n");
			System.out.println("Enter your bus no: ");
			int busno=scanner.nextInt();
			Busdao buscap=new Busdao();
		buscap.checkcapacity(busno);
		
		break;
		case 3:
			System.exit(0);
			default:
				System.out.println("please check your input");
				break;
		}
		//if(s==1)
//		{

//		
//	}
		
		
		
//	}
////	
//catch(Exception e)
//		{
//		System.out.println(e);
//	}
	}
	}}
 