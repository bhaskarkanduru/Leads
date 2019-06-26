package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> set = new HashSet<>();
		set.add("Naveen");
		set.add("Edvin");
		set.add("Srinu");
		set.add("Venu");
		set.add("Sindhu");
		set.add("Srinu");
		//set.add(2, "Bhaksar");
		//ls.add(3,"Gopi");
		
				
for (String eachfriend : set) 
{
	System.out.println(eachfriend);
	
}

System.out.println("*******************");

List<String> ls = new ArrayList<>();
Collections.sort(ls);
ls.addAll(set);


for (String listobject : ls) 
{
	//if(listobject.startsWith("S"))
	System.out.println(listobject);
	
}

System.out.println("*******************");
//Print only duplicate names

for (String listobject : ls) 
{
	//if(listobject.startsWith("S"))
	//System.out.println(listobject);
		
}

System.out.println("*******************");

System.out.println(ls.get(2));

System.out.println("*******************");



	}

}
