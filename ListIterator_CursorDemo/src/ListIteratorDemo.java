import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo 
{
	public static void main(String[] args) 
	{
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("Ak");
		ll.add("Aj");
		ll.add("As");
		ll.add("Al");
		ll.add("10");
		System.out.println(ll);
		
		ListIterator<String> li=ll.listIterator();
		while(li.hasNext())
		{
			String s=(String)li.next();

			if(s.equals("As"))
				li.remove();	//We can remove 
			else if(s.equals("Ak"))
				li.set("Ajinkya");//we can replace
			else if(s.equals("Al"))
				li.add("ARK");//we can add new data
			else if(s.equals("Aj"))
				li.add(null);//null values also allowed
		}
		System.out.println(ll);
	}
}
