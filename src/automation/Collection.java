package automation;

import java.util.ArrayList;
import java.util.List;

public class Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> a1=new ArrayList<>();
		a1.add("a");
		a1.add("b");
		a1.add("b");
		a1.add(null);
		int count=a1.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			String s=a1.get(i);
			System.out.println(s);
		}

	}

}
