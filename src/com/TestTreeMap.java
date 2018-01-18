package com;

import java.util.Map.Entry;
import java.util.TreeMap;

public class TestTreeMap {
	public static void main(String[] args) {
		Dog d1 = new Dog("red", 30);
		Dog d2 = new Dog("black", 20);
		Dog d3 = new Dog("white", 10);
		Dog d4 = new Dog("white", 40);
 
		TreeMap<Dog, Integer> treeMap = new TreeMap<Dog, Integer>();
		treeMap.put(d1, 20);
		treeMap.put(d2, 5);
		treeMap.put(d3, 15);
		treeMap.put(d4, 10);
 
		for (Entry<Dog, Integer> entry : treeMap.entrySet()) {
			System.out.println(entry.getValue() + " - "+entry.getKey());
		}
	}
}

class Dog implements Comparable<Dog>{
	String color;
	int size;
 
	Dog(String c, int s) {
		color = c;
		size = s;
	}
 
	public String toString(){	
		return color + " dog size "+size;
	}
 
	@Override
	public int compareTo(Dog o) {
		return  o.size - this.size;
	}
}

