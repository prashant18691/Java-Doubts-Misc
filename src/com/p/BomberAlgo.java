package com.p;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class BomberAlgo {

	public String bomberAlgo(String str){

		if(str==null)
		return null;

		StringBuilder bombedStr = new StringBuilder();


		Map<Character,Integer> map = new HashMap<>();
		for(int i=0;i<str.length();i++){
		Integer count = map.get((Character)str.charAt(i));
		if(count==null){
		map.put(str.charAt(i),1);
		}
		else{
		map.put(str.charAt(i), ++count);  //abcdeeeeddcbfgf
		}

		}

		for(Character ch:str.toCharArray()){
		for(Entry<Character,Integer> e : map.entrySet()){
		int c = e.getValue();
		Character eachCh = e.getKey();

		if(c<3 && ch.equals(eachCh)){
		bombedStr.append(e.getKey());
		break;
		}
		}

		}


		return bombedStr.toString();
}

	public static void main(String[] args) {

		BomberAlgo a = new BomberAlgo();
		System.out.println(a.bomberAlgo("abcdeeeeddaacbfgf"));
	}

}
