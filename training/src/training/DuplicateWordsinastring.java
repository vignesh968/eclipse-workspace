package training;
import java.util.*;
public class DuplicateWordsinastring {
	String a="vickyckycebanish";
	Map<Character,Integer> res=new HashMap<Character,Integer>();
	int j=0;
	for(int i=0;i<a.length();i++){
	    if(res.containsKey(a.charAt(i))){
	        j=res.get(a.charAt(i));
	        res.put(a.charAt(i),j+1);
	    }
	    else{
	        res.put(a.charAt(i),1);
	    }
	    
	}
	int min=Integer.MAX_VALUE;
	int max=Integer.MIN_VALUE;
	char mi='/';
	char ma='/';
	for(Map.Entry fin:res.entrySet()){
	    if((int)fin.getValue()<min){
	        mi=(char)fin.getKey();
	    }
	}
	System.out.print(mi);
}
}
