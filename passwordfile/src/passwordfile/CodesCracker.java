package passwordfile;
import java.util.*;
import java.awt.Desktop;
import java.io.*; 
import passwordfile.*;
public class CodesCracker 
{ 
	public static void main(String[] args){  
	int d;
	if(d==1)
	{
	try  
{  
		File file=new File("F:\\krctapp\\running.txt");   
Scanner sc = new Scanner(file);     //file to be scanned  
while (sc.hasNextLine())        //returns true if and only if scanner has another token  
System.out.println(sc.nextLine());    
}  
catch(Exception e)  
{  
e.printStackTrace();  
}  
}
}
else {
	System.out.println("not open");
}
}