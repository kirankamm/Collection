import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StreamOne  {

	public static void main(String[] args) {
		
		
	List<Integer> list=new ArrayList<Integer>();
		
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);
		list.add(16);
		
Iterator<Integer> itr=list.iterator();	
while(itr.hasNext()) {
Integer integerValues=itr.next();
	
if(integerValues % 2 == 0)
System.out.println(integerValues);

List<Integer> listOfEvenNumbers=list.stream().filter(integerValues ->(integerValues % 2 !== 0).collectors.toList());

System.out.println(listOfEvenNumbers);

list.stream().forEach(intigerValue->System.out.println(intigerValue));

	}
	}
}
