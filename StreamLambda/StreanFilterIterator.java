import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class StreanFilterIterator {

	public static void main(String[] args) {
		
	
	List<Integer> list=new ArrayList<Integer>();
	
	list.add(111);
	list.add(122);
	list.add(133);
	list.add(144);
	list.add(155);
	
	list.add(166);
	list.add(177);
	list.add(188);
	list.add(199);
	list.add(123);
	
	
	Iterator<Integer> itr=list.iterator();	
	while(itr.hasNext()) {
	Integer integerValues=itr.next();
		
	if(integerValues % 2 == 0) {
	System.out.println(integerValues);
	}
	}
	list.stream().forEach(intigerValue->System.out.println(intigerValue));
	List<Integer> listOfEvenNumbers=list.stream().filter(j ->(j%2!=0)).collect(Collectors.toList());

	System.out.println(listOfEvenNumbers);


	}
	}
