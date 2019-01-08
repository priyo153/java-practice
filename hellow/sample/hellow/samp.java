package hellow;
import static java.lang.System.*;
import java.util.*;


public class samp{
	public static void main(String [] args){
		Map<String,Integer> m=new HashMap<String,Integer>();
		m.put("", 1);
		m.put("", 2);
		m.put("", 3);		
		m.put("a", 1);
		m.put("a", 2);
		m.put("a", 1);		
		int count=0;
		for(Map.Entry x: m.entrySet())
		{
			count++;
			
			out.println("counter="+count);
			out.println("key="+x.getKey()+" val="+x.getValue());
			
		}
	}
}