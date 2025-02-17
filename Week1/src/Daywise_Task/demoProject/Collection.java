package demoProject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;
import java.util.HashMap;
import java.util.*;
public class Collection {
	
	
	
	
	public static void main(String[] args) {
		//arraylist
		//ArrayList<Integer> l = new ArrayList<>();
		Vector<Integer> l = new Vector<>();
		l.add(19);
		l.add(20);
		l.add(39);
		
		Enumeration<Integer> en = l.elements();
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
		//l.removeAll(l);
		//System.out.println(l.isEmpty());
		//System.out.println(l.contains(39));
		//l.forEach(x->System.out.println(x));
		ArrayList<Integer> l1 = new ArrayList<>();
		l1.add(20);
		l1.add(2);
		l1.add(7);
		l1.forEach(x->System.out.println(x));
		
		//l1.retainAll(l);
		//l1.addAll(l);
		//l1.forEach(x->System.out.println(x));
		
		//list
		List<String> l2 = Arrays.asList("Array","Set","Map");
		l2.forEach(y->System.out.println(y));
		//Linkedlist
		//LinkedList<Integer> l2 = new LinkedList<>();
		
		//HashSET LinkedHashSet TreeSet
		TreeSet<Integer> hs = new TreeSet<>();
		hs.add(100);
		hs.add(92);
		hs.add(120);
		hs.add(17);
		hs.forEach(z->System.out.println(z));
		
		//Map
		Hashtable<Integer,String> map=new Hashtable<>();// concurrent
		map.put(1, "iit");
		map.put(12, "iith");
		map.put(11, "mu");
		map.put(13, "iith");
		//map.put(null, null);
		//map.put(null, "bits"); key value can't be null & same
		System.out.println(map);
		System.out.println(map.remove(1));
		Set<Integer> keys=map.keySet();
		System.out.println(keys);
		
		Set entries=map.entrySet();
		Iterator i=entries.iterator();
		while(i.hasNext()) {
			Map.Entry entry=(Map.Entry)i.next();
			System.out.println(entry.getKey()   +"  "+entry.getValue());
		}
		
	}
}
 