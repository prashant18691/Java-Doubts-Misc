package com.questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.NavigableMap;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class TestCollections {

	public static void main(String[] args) {
		TreeMap tree = new TreeMap();
		tree.put("aa", 1);
		tree.put("cc", 2);
		tree.put("ee", 3);
		tree.put("gg", 4);
		NavigableMap nvMap = tree.headMap("ee", false);
//		nvMap.put("nn", 5); // line 16
		System.out.println(nvMap);
		
		
		
		Set<Foo> myFooSet = new HashSet<Foo>();
		myFooSet.add(new Foo(2));
		myFooSet.add(new Foo(1));
		myFooSet.add(new Foo(3));
		myFooSet.add(new Foo(3));
		myFooSet.add(new Foo(2));
		for(Foo f:myFooSet)
			System.out.println(f);
		System.out.print(myFooSet.size());
		
		
		
		Foo foo1 = new Foo(1);
		Foo foo2 = new Foo(2);
		
		System.out.println(foo1.equals(foo2));
		
		
		Set s = new HashSet();
		s.add("A"); // Line 1
		s.add(new Foo()); // Line 2
		Set t = new TreeSet();
		t.add("A"); // Line 3
//		t.add(new Foo()); // Line 4
		
		
		
		List<Human> humans = new ArrayList<Human>();
		humans.add(new Human(13));
		humans.add(new Human(33));
		humans.add(new Human(21));
		humans.add(new Human(21));
		HumanComparator c = new HumanComparator(); // line 2
		Collections.sort(humans, c); // line 3
		System.out.print(humans.get(0).age);
		Collections.sort(humans); // line 4
		System.out.println(humans.get(0).age);
		
		
		TreeMap<Integer,String> map  = new TreeMap<Integer,String>();
		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "three");
		map.put(4, "four");
		SortedMap<Integer, String> smap1 = map.tailMap(2);
		SortedMap<Integer, String> smap2 = smap1.headMap(4);
		SortedMap<Integer, String> smap3 = smap2.subMap(2, 3);
		System.out.println(smap3);
		
		
		
		TreeSet<Integer> map1  = new TreeSet<Integer>();
		map1.add(1);
		map1.add(2);
		map1.add(4);
		map1.add(7);
		SortedSet<Integer> smap = map1.subSet(2,7);
		map1.add(5);
		map1.add(9);
		System.out.println(smap);
		
		Queue<Integer> queue  = new LinkedList<Integer>();
		
		queue.peek();

	}

}
class HumanComparator implements Comparator<Human> {
	public int compare(Human h1, Human h2) {
		return h1.age.compareTo(h2.age);
	}
}
class Human implements Comparable<Human> {
	Integer age;
	public Human(Integer age) {
		this.age = age;
	}
	public int compareTo(Human h) {
		return h.age.compareTo(this.age);
	}
}
    

class Foo  {
	Integer code;
	Foo(Integer c) {
		code = c;
	}
	
	Foo(){
		
	}
	public boolean equals(Foo f) {
		return false;
	}
	
	public boolean equals(Object f) {
		return true;
	}
	public int hashCode() {
		return 17;
	}
	@Override
	public String toString() {
		return "Foo [code=" + code + "]";
	}
	
}



