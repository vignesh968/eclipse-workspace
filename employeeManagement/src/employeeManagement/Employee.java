	//types of statement
	//1.normal statement     ex:   Statement st=con.createStatement();
	//2.prepared statement   ex:   	PreparedStatement pst= con.prepareStatement(query);
	//3. callable statement  --> it use for stored procedure, it call the stored data 
		//ex: 	CallableStatement csd=connection.prepareCall("{call GetEmp()}");
	
	package employeeManagement;
	import java.sql.*;
	import java.sql.SQLException;
	import java.util.Scanner;
	public class Employee {
	
		public static void main(String[] args) throws Exception{
	Scanner scanner=new Scanner(System.in);
//commitdemo();
batchdemo();

	//			System.out.println("Welcome to Employee Management\n"+"1.insert record \n "
//			+ "2. update record \n 3.delete record");
//	System.out.println("Enter your choice");
//	int choice=scanner.nextInt();
//	switch (choice) {
//	case 1:
//		insertusingpst();
//		break;
//	case 2:
//		updateusingpst();
//		break;
//	case 3:
//		deleterecords();
//		break;
//	case 4:
//		System.out.println("thank you for using");
//		System.exit(0);
//		break;
//	default:
//		System.out.println("Please Enter a vaild choice");
//		break;
//
//	}
	//			insertrecords();
		//insertvalue();
		//insertusingpst();
		//deleterecords();
		//updaterecords();
		//updateusingpst();
			readrecords();
			//sp();
		//	sp2();
		}
	
		public static void readrecords() throws Exception{
	
			String url="jdbc:mysql://localhost:3306/jdbcdemo";
			String userName="root";
			String password="Vicky@2611";
			String query="select * from employee";
			Connection con=DriverManager.getConnection(url, userName, password);
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(query);
			while (rs.next()) {
			System.out.println("Id is "+rs.getInt(1));
			System.out.println("Name is "+rs.getString(2));
			System.out.println("salary is "+rs.getInt(3));
			}	con.close();
		}
		
		//insert type 1
		// insert by using the direct in query
		public static void insertrecords() throws Exception{
	
			String url="jdbc:mysql://@localhost:3306/jdbcdemo";
			String userName="root";
			String password="Vicky@2611";
			
	 		String query="insert into employee values(4,'raja',100000)";
			Connection con=DriverManager.getConnection(url, userName, password);
			Statement st=con.createStatement();
			int rows=st.executeUpdate(query);  ///while insert the record use  the requried to use INT 
			System.out.println("Number of affected "+rows);	
			con.close();
		}
		//insert type 2
	public static void insertvalue() throws Exception{
		Scanner s=new Scanner(System.in);
		String url="jdbc:mysql://@localhost:3306/jdbcdemo";
		String userName="root";
		String password="Vicky@2611";
		System.out.println("insert your details into database");
		System.out.println("Enter ID :");
		int id=s.nextInt();
		System.out.println("Enter a name");
		String name=s.next();
		System.out.println("Enter a salary");
		int salary=s.nextInt();
		String query="insert into employee values("+id+",'"+name+"',"+salary+");";
		Connection con=DriverManager.getConnection(url, userName, password);
		Statement st=con.createStatement();
		int rows=st.executeUpdate(query);  ///while insert the record use  the requried to use INT 
		System.out.println("Number of affected "+rows);	
		con.close();
	}
	//insert type 3
	public static void insertusingpst() throws Exception{// pst means prepared statement
		Scanner s=new Scanner(System.in);
		String url="jdbc:mysql://@localhost:3306/jdbcdemo";
		String userName="root";
		String password="Vicky@2611";
		System.out.println("insert your details into database");
		System.out.println("Enter ID :");
		int id=s.nextInt();
		System.out.println("Enter a name");
		String name=s.next();
		System.out.println("Enter a salary");
		int salary=s.nextInt();
		String query="insert into employee values(?,?,?);";
		Connection con=DriverManager.getConnection(url, userName, password);
		PreparedStatement pst= con.prepareStatement(query);
		pst.setInt(1, id);
		pst.setString(2, name);
		pst.setInt(3, salary);
		int rows=pst.executeUpdate();///no need query inside the update because already send to it
		System.out.println("Number of row affected "+rows);
		System.out.println("------------------------------------------");
		readrecords();
		con.close();
	}
	//delete method
	public static void deleterecords() throws Exception{
	Scanner scanner=new Scanner(System.in);
		String url="jdbc:mysql://@localhost:3306/jdbcdemo";
		String userName="root";
		String password="Vicky@2611";
		System.out.println("Enter Id to delete details");
		int id=scanner.nextInt();
		String query="delete from employee where emp_id="+id;
		Connection con=DriverManager.getConnection(url, userName, password);
		Statement st=con.createStatement();
		int rows=st.executeUpdate(query);  ///while insert the record use  the requried to use INT 
		System.out.println("Number of affected "+rows);	
		con.close();
	}
	//update type 1
	public static void updaterecords() throws Exception{
	Scanner scanner=new Scanner(System.in);
		String url="jdbc:mysql://@localhost:3306/jdbcdemo";
		String userName="root";
		String password="Vicky@2611";
		System.out.println("Enter Id to delete details");
		int id=scanner.nextInt();
		String query="update  employee set salary=1000000 where emp_id="+id;
		Connection con=DriverManager.getConnection(url, userName, password);
		Statement st=con.createStatement();
		int rows=st.executeUpdate(query);  ///while insert the record use  the requried to use INT 
		System.out.println("Number of affected "+rows);	
		con.close();
	}
	
	//update type 2
	public static void updateusingpst() throws Exception{
	Scanner scanner=new Scanner(System.in);
		String url="jdbc:mysql://@localhost:3306/jdbcdemo";
		String userName="root";
		String password="Vicky@2611";
		System.out.println("Enter Id to delete details");
		int id=scanner.nextInt();
		String query="update  employee set salary=80000000 where emp_id=?";
		Connection con=DriverManager.getConnection(url, userName, password);
	PreparedStatement pst=con.prepareStatement(query);
	pst.setInt(1, id);
	int rows=pst.executeUpdate();
		///while insert the record use  the requried to use INT 
		System.out.println("Number of affected "+rows);	
		con.close();
	}
	//sp-stored procedure
	//calling simple stored procedure 
	public static void sp()throws Exception {
		String url="jdbc:mysql://localhost:3306/jdbcdemo";
		String userName="root";
		String passWord="Vicky@2611";
		Connection con=DriverManager.getConnection(url, userName, passWord);
		CallableStatement csd=con.prepareCall("{call GetEmp()}");//we direct call the stored procedure inside bracket
		ResultSet rs=csd.executeQuery();// stored procedure try to read only so i give executequery
		while (rs.next()) {
			System.out.println("Id is "+rs.getInt(1));
			System.out.println("Name is "+rs.getString(2));
			System.out.println("salary is "+rs.getInt(3));
		}
		con.close();
	}
	
	//calling simple stored procedure with In parrameter &outer parameter 
	public static void sp3()throws Exception {
		Scanner scanner=new Scanner(System.in);
		String url="jdbc:mysql://localhost:3306/jdbcdemo";
		String userName="root";
		String password="Vicky@2611";
		System.out.println("Enter a ID to print or showcase");
		int id=scanner.nextInt();
		Connection con=DriverManager.getConnection(url, userName, password);
		CallableStatement cst=con.prepareCall("{call GetNameId(?,?)}"); 
		// in param
		cst.setInt(1, id);
		 cst.registerOutParameter(2,Types.VARCHAR);   
		cst.executeUpdate();
	System.out.println(cst.getString(2));	
	con.close();
	}
	public static void sp2()throws Exception {
		Scanner scanner=new Scanner(System.in);
		String url="jdbc:mysql://@localhost:3306/jdbcdemo";
		String userName="root";
		String password="Vicky@2611";
		System.out.println("Enter a ID to print or showcase");
		int id=scanner.nextInt();
		Connection con=DriverManager.getConnection(url, userName, password);
		CallableStatement cst=con.prepareCall("{call GetEmpById(?)}");
		cst.setInt(1, id);
		ResultSet rs=cst.executeQuery();
	
			while (rs.next()) {
			System.out.println("Id is "+rs.getInt(1));
			System.out.println("Name is "+rs.getString(2));
			System.out.println("salary is "+rs.getInt(3));
			}	con.close();
	}
	//commit vs autocommit
	
	//autocommit means it automatically execute and update in database , if one query is without mistake it autocommit ,second query has mistake it not commits
	 public static void commitdemo() throws Exception{
			Scanner scanner=new Scanner(System.in);
			String url="jdbc:mysql://localhost:3306/jdbcdemo";
			String userName="root";
			String password="Vicky@2611"; 
			 String query1="update employee set salary=800 where emp_id=7"; 
			 String query2="update employee set salary=7800 where emp_id=4"; 
				Connection con=DriverManager.getConnection(url, userName, password);
				
				con.setAutoCommit(false);
				Statement st=con.createStatement();
				int rows1 = st.executeUpdate(query1);
				System.out.println("rows affected "+rows1);
				int rows2=st.executeUpdate(query2);
				System.out.println("rows affected "+rows2);
				if(rows1>0 && rows2>0)
				{
					con.commit();// when both query are true or no mistake in it then it will commit
				}
	 }
	 
	//batch processing
	 	//means combine  all and execute and change or update database , just add all query to batch
	 public static void batchdemo() throws Exception{
			Scanner scanner=new Scanner(System.in);
			String url="jdbc:mysql://localhost:3306/jdbcdemo";
			String userName="root";
			String password="Vicky@2611"; 
			
			 String query1="update employee set salary=1000 where emp_id=7"; 
			 String query2="update employee set salary=2000 where emp_id=4"; 
			 String query3="update employee set salary=3000 where emp_id=2"; 
			 String query4="update employee set salary=4000 where emp_id=10"; 
				Connection con=DriverManager.getConnection(url, userName, password);
			con.setAutoCommit(false);
				Statement st=con.createStatement();
			 st.addBatch(query1);
			 st.addBatch(query2);	
			 st.addBatch(query3);
			 st.addBatch(query4);
			 int res[]=st.executeBatch();
			 for(int i:res)
			 {
				  if(i>0)
				  {
					  continue;
				  }
				  else {
					  con.rollback();
				  }
				 //System.out.println("ROWS affected: "+i   );
			 }
			 con.commit();
			 con.close();
	 }
	  
	}
