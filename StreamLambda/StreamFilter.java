import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilter {

	
	public static void main(String[] args) {
		
	
	List<Integer> list=new ArrayList<Integer>();
		
		list.add(50);
		list.add(51);
		list.add(52);
		list.add(53);
		list.add(55);
		list.add(56);
		list.add(67);
		list.add(58);
		list.add(59);
		list.add(60);
		
		
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
