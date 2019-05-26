//WAP to insert objects into TreeSet where order will be descending
import java.util.Comparator;
import java.util.TreeSet;

public class TreeDemo 
{
	public static void main(String[] args) 
	{
		@SuppressWarnings("unchecked")
		TreeSet<Integer> t= new TreeSet<Integer>(new myComparator());
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(20);
		t.add(20);
		System.out.println(t);
	}
}

@SuppressWarnings("rawtypes")
class myComparator implements Comparator//implementation of comparator interface for custom sorting
{ 
	public int compare(Object o1, Object o2)
	{
		Integer i1=(Integer)o1;
		Integer i2=(Integer)02;
		//return i1.compareTo(i2); //To Get Natural sorting using comparator also
		//return +1; //To get insertion order
		//return -1;//To get reverse of insertion order 
		if(i1<i2)
			return +1;
		else if(i1>i2)
			return -1;
		else 
			return 0;
	}	
}