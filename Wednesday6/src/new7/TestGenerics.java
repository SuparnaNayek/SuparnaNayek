package new7;
import java.util.*;


public class TestGenerics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String>list=new ArrayList<String>();
list.add("rahul");
list.add("joy");
String s=list.get(1);
System.out.println("element is:"+s);
Iterator<String>itr=list.iterator();
while(itr.hasNext()) {
	System.out.println(itr.next());
}
	}

}
