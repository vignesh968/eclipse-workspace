package BusReservationSystem;

public class bus {
private int busno;
private boolean ac;
private int capacity; // to access use or create get and set
	public bus(int busno,boolean ac, int cap) 
		{
		this.busno=busno;
		this.ac=ac;
		this.capacity=cap;
		}
		public int getCapacity()// to get and send
		{
			return capacity;
		}
		public void setCapacity(int cap) //change
		{
		capacity=cap;
		}
		public boolean getac() // accessor method
		{
		return	ac;
		}
		public void setac(boolean ac) //mutator
		{
			this.ac=ac;
		}
		void disbusinfo() {
			System.out.println("Busno: "+busno+"Ac: "+ac+"capacity: "+capacity);

		}

		public int getbusno() {
			// TODO Auto-generated method stub
			return 0;
		}
		public void setbusno(int busno) {
			this.busno=busno;
		}
		
	

}
